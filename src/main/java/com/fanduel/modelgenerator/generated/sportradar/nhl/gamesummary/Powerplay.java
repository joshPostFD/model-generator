package com.fanduel.modelgenerator.generated.sportradar.nhl.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Powerplay {
    @JsonProperty("faceoffs_won")
    private Integer faceoffsWon;

    @JsonProperty("strength")
    private List<Strength> strength;

    @JsonProperty("faceoffs")
    private Integer faceoffs;

    @JsonProperty("faceoff_win_pct")
    private Double faceoffWinPct;

    @JsonProperty("opportunities")
    private Integer opportunities;

    @JsonProperty("saves_pct")
    private Integer savesPct;

    @JsonProperty("saves")
    private Integer saves;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("faceoffs_lost")
    private Integer faceoffsLost;

    @JsonProperty("shots_against")
    private Integer shotsAgainst;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("missed_shots")
    private Integer missedShots;
}
