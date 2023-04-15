
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "jersey",
    "position",
    "yards",
    "avg_yards",
    "touchdowns",
    "longest",
    "faircatches",
    "number"
})
@Generated("jsonschema2pojo")
public class Player__16 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("position")
    public String position;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("faircatches")
    public Integer faircatches;
    @JsonProperty("number")
    public Integer number;

}
