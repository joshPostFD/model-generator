package com.fanduel.modelgenerator.generated.sportradar.nfl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class PlayerProfileResponse {
    @JsonProperty("college")
    private String college;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("weight")
    private Double weight;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("rookie_year")
    private Integer rookieYear;

    @JsonProperty("college_conf")
    private String collegeConf;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("name")
    private String name;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("position")
    private String position;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("status")
    private String status;

    public Optional<String> getCollege() {
        return Optional.ofNullable(college);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public List<Season> getSeasons() {
        return Optional.ofNullable(seasons).orElse(Collections.emptyList());
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<Double> getWeight() {
        return Optional.ofNullable(weight);
    }

    public Optional<String> getBirthDate() {
        return Optional.ofNullable(birthDate);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getBirthPlace() {
        return Optional.ofNullable(birthPlace);
    }

    public Optional<Integer> getRookieYear() {
        return Optional.ofNullable(rookieYear);
    }

    public Optional<String> getCollegeConf() {
        return Optional.ofNullable(collegeConf);
    }

    public Optional<String> getJersey() {
        return Optional.ofNullable(jersey);
    }

    public Optional<Draft> getDraft() {
        return Optional.ofNullable(draft);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getHighSchool() {
        return Optional.ofNullable(highSchool);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Integer> getHeight() {
        return Optional.ofNullable(height);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
