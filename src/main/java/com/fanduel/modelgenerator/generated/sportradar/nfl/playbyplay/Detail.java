package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Detail {
    @JsonProperty("result")
    private String result;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("start_location")
    private StartLocation startLocation;

    @JsonProperty("penalty")
    private Penalty penalty;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("review")
    private Review review;

    @JsonProperty("description")
    private String description;

    @JsonProperty("recovery")
    private Recovery recovery;

    @JsonProperty("category")
    private String category;

    @JsonProperty("end_location")
    private EndLocation endLocation;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("direction")
    private String direction;
}