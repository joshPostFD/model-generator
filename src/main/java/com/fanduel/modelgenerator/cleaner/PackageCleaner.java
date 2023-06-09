package com.fanduel.modelgenerator.cleaner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

import javax.annotation.processing.Generated;
import javax.lang.model.element.Modifier;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class PackageCleaner {

    private final String outputDirectory;
    private final String basePackage;

    public PackageCleaner(String outputDirectory, String basePackage) {
        this.outputDirectory = outputDirectory;
        this.basePackage = basePackage;
    }

    public void clean(String packageName) throws IOException {
        System.out.println("Starting process to clean generated code.");
        File rootDirectory = new File(getBasePackagePath() + "/" + packageName);
        if (rootDirectory.listFiles() == null) {
            return;
        }

        List<File> allFiles = getAllFilesFromRootDirectory(rootDirectory);

        // compile the java file
        System.out.println("Compiling files under " + rootDirectory.getName() + "...");
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null,
                allFiles.stream()
                        .filter(file -> file.getName().endsWith(".java"))
                        .map(File::getAbsolutePath)
                        .toArray((String[]::new)));
        if (result == 0) {
            System.out.println("Compilation successful.");
        } else {
            log.error("Compilation could not be completed, finished with exit code {}.", result);
            throw new RuntimeException();
        }

        for (File file : rootDirectory.listFiles()) {
            try {
                clean(file);
            } catch (ClassNotFoundException e) {
                log.error("Class {} cannot be accessed on the classpath. You will need to rebuild/restart the application to clean this folder.", e.getMessage());
                e.printStackTrace();
                return;
            }
        }
        System.out.println("Code cleaning completed.");
    }

    private String getBasePackagePath() {
        return outputDirectory + basePackage.replaceAll("\\.", "/");
    }

    private void clean(File rootDirectory) throws IOException, ClassNotFoundException {
        final String targetPackage = rootDirectory.getParentFile().getName() + '.' + rootDirectory.getName();

        List<File> allFiles = getAllFilesFromRootDirectory(rootDirectory);
        URL url = new File(outputDirectory).toURI().toURL();
        URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{url});

        Collection<File> filesToDelete = allFiles
                .stream()
                .filter(file -> file.getName().contains("__")).collect(Collectors.toCollection(LinkedList::new));

        Map<String, List<Class<?>>> classMap = new HashMap<>();
        for (File file : allFiles) {
            String name = file.getName();
            if (name.endsWith(".java")) {
                String fileString = FileUtils.readFileToString(file, "UTF-8");
                String packageName = fileString.substring(fileString.indexOf("package ") + 8, fileString.indexOf(";"));

                // load the new class
                Class<?> clazz = classLoader.loadClass(packageName + "." + name.split("\\.")[0]);

                String key = clazz.getSimpleName().split("_")[0];
                if (!classMap.containsKey(key)) {
                    classMap.put(key, new LinkedList<>());
                }
                classMap.get(key).add(clazz);
            }
        }
        classLoader.close();

        filesToDelete.addAll(getAllFilesFromRootDirectory(rootDirectory)
                .stream()
                .filter(file -> file.getName().endsWith(".class"))
                .collect(Collectors.toList()));

        classMap.forEach((String baseClassName, List<Class<?>> classes) -> {
            TypeSpec.Builder typeSpecBuilder = TypeSpec
                    .classBuilder(baseClassName)
                    .addModifiers(Modifier.PUBLIC)
                    .addAnnotation(Setter.class)
                    .addAnnotation(AnnotationSpec.builder(Accessors.class)
                            .addMember("chain", "true")
                            .build())
                    .addAnnotation(
                            AnnotationSpec
                                    .builder(Generated.class)
                                    .addMember("value", "\"fanduel-model-generator\"")
                                    .build());
            Map<String, Field> fieldMap = new HashMap<>();
            classes.stream()
                    .flatMap(clazz -> Arrays.stream(clazz.getFields()))
                    .forEach(field -> {
                        String fieldName = field.getName();
                        fieldMap.put(fieldName, field);
                    });
            fieldMap.forEach((fieldName, field) -> {
                Type fieldType = getBaseTypeForField(classMap, field);
                FieldSpec.Builder fieldSpecBuilder = FieldSpec
                        .builder(fieldType, fieldName)
                        .addModifiers(Modifier.PRIVATE);
                Arrays.stream(field.getDeclaredAnnotations()).forEach(annotation ->
                        fieldSpecBuilder.addAnnotation(
                                AnnotationSpec
                                        .builder(annotation.annotationType())
                                        .addMember("value", '"' + ((JsonProperty) annotation).value() + '"')
                                        .build()
                        ));
                FieldSpec fieldSpec = fieldSpecBuilder.build();
                typeSpecBuilder.addField(fieldSpec);
                MethodSpec.Builder methodSpecBuilder = MethodSpec.methodBuilder("get" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1));
                methodSpecBuilder.addModifiers(Modifier.PUBLIC);

                if (field.getType().equals(List.class)) {
                    methodSpecBuilder.returns(fieldType);
                    methodSpecBuilder.addCode("return Optional.ofNullable(" + fieldName + ").orElse($T.emptyList());", Collections.class);
                } else {
                    methodSpecBuilder.returns(new ParameterizedType() {
                        @Override
                        public Type[] getActualTypeArguments() {
                            return new Type[]{fieldType};
                        }

                        @Override
                        public Type getRawType() {
                            return Optional.class;
                        }

                        @Override
                        public Type getOwnerType() {
                            return Optional.class;
                        }
                    });
                    methodSpecBuilder.addCode("return Optional.ofNullable(" + fieldName + ");");
                }
                MethodSpec methodSpec = methodSpecBuilder.build();
                typeSpecBuilder.addMethod(methodSpec);
            });
            JavaFile javaFile = JavaFile
                    .builder(basePackage + "." + targetPackage, typeSpecBuilder.build())
                    .indent("    ")
                    .build();

            try {
                if (log.isTraceEnabled()) {
                    javaFile.writeTo(System.out);
                }
                Path path = Paths.get(outputDirectory);
                javaFile.writeTo(path);
                for (File file : filesToDelete) {
                    file.delete();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private List<File> getAllFilesFromRootDirectory(File rootDirectory) {
        LinkedList<File> files = new LinkedList<>(List.of(rootDirectory));
        List<File> allFiles = new LinkedList<>();
        while (!files.isEmpty()) {
            File root = files.pop();
            if (root.listFiles() == null) {
                continue;
            }
            for (File file : root.listFiles()) {
                if (file.isDirectory()) {
                    files.addLast(file);
                } else {
                    allFiles.add(file);
                }
            }
        }
        return allFiles;
    }

    private Type getBaseTypeForField(Map<String, List<Class<?>>> classMap, Field field) {
        String name = field.getType().getSimpleName().split("_")[0];
        Optional<Class<?>> clazzOpt = classMap.getOrDefault(name, new LinkedList<>())
                .stream()
                .filter(clazz -> clazz.getSimpleName().equals(name))
                .findAny();
        if (clazzOpt.isPresent()) {
            return clazzOpt.get();
        }
        if (field.getGenericType() instanceof ParameterizedType) {
            ParameterizedType stringListType = (ParameterizedType) field.getGenericType();
            Type[] genericTypeArr = stringListType.getActualTypeArguments();
            return new ParameterizedType() {
                @Override
                public Type[] getActualTypeArguments() {
                    Type[] arr = new Type[genericTypeArr.length];
                    for (int index = 0; index < arr.length; index++) {
                        arr[index] = getBaseTypeForType(classMap, genericTypeArr[index]);
                    }
                    return arr;
                }

                @Override
                public Type getRawType() {
                    return field.getType();
                }

                @Override
                public Type getOwnerType() {
                    return null;
                }
            };
        }
        return field.getGenericType();
    }

    private Type getBaseTypeForType(Map<String, List<Class<?>>> classMap, Type type) {
        String[] typeNameArr = type.getTypeName().split("\\.");
        String name = typeNameArr[typeNameArr.length - 1].split("_")[0];
        Optional<Class<?>> clazzOpt = classMap.getOrDefault(name, new LinkedList<>())
                .stream()
                .filter(clazz -> clazz.getSimpleName().equals(name))
                .findAny();
        if (clazzOpt.isPresent()) {
            return clazzOpt.get();
        } else {
            return type;
        }
    }
}
