package com.fanduel.modelgenerator.generated.nflv7.postgamestandings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class Record {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("points_against")
    private Integer pointsAgainst;

    @JsonProperty("ties")
    private Integer ties;

    @JsonProperty("points_for")
    private Integer pointsFor;

    @JsonProperty("category")
    private String category;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("win_pct")
    private Double winPct;

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Integer> getPointsAgainst() {
        return Optional.ofNullable(pointsAgainst);
    }

    public Optional<Integer> getTies() {
        return Optional.ofNullable(ties);
    }

    public Optional<Integer> getPointsFor() {
        return Optional.ofNullable(pointsFor);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }

    public Optional<Integer> getLosses() {
        return Optional.ofNullable(losses);
    }

    public Optional<Double> getWinPct() {
        return Optional.ofNullable(winPct);
    }
}
