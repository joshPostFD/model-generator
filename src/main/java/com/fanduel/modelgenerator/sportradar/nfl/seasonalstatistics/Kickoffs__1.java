
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "endzone",
    "inside_20",
    "return_yards",
    "returned",
    "touchbacks",
    "yards",
    "out_of_bounds",
    "kickoffs",
    "onside_attempts",
    "onside_successes",
    "squib_kicks"
})
@Generated("jsonschema2pojo")
public class Kickoffs__1 {

    @JsonProperty("endzone")
    public Integer endzone;
    @JsonProperty("inside_20")
    public Integer inside20;
    @JsonProperty("return_yards")
    public Integer returnYards;
    @JsonProperty("returned")
    public Integer returned;
    @JsonProperty("touchbacks")
    public Integer touchbacks;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("out_of_bounds")
    public Integer outOfBounds;
    @JsonProperty("kickoffs")
    public Integer kickoffs;
    @JsonProperty("onside_attempts")
    public Integer onsideAttempts;
    @JsonProperty("onside_successes")
    public Integer onsideSuccesses;
    @JsonProperty("squib_kicks")
    public Integer squibKicks;

}
