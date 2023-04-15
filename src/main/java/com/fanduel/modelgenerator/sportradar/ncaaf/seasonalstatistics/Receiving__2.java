
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "receptions",
    "targets",
    "yards",
    "avg_yards",
    "longest",
    "touchdowns",
    "longest_touchdown",
    "yards_after_catch",
    "redzone_targets",
    "air_yards",
    "first_downs"
})
@Generated("jsonschema2pojo")
public class Receiving__2 {

    @JsonProperty("receptions")
    public Integer receptions;
    @JsonProperty("targets")
    public Integer targets;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;
    @JsonProperty("yards_after_catch")
    public Integer yardsAfterCatch;
    @JsonProperty("redzone_targets")
    public Integer redzoneTargets;
    @JsonProperty("air_yards")
    public Integer airYards;
    @JsonProperty("first_downs")
    public Integer firstDowns;

}
