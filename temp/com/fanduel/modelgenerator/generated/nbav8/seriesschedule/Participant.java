package com.fanduel.modelgenerator.generated.nbav8.seriesschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class Participant {
    @JsonProperty("seed")
    private Integer seed;

    @JsonProperty("record")
    private Integer record;

    @JsonProperty("name")
    private String name;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("source")
    private Source source;

    public Optional<Integer> getSeed() {
        return Optional.ofNullable(seed);
    }

    public Optional<Integer> getRecord() {
        return Optional.ofNullable(record);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<Source> getSource() {
        return Optional.ofNullable(source);
    }
}
