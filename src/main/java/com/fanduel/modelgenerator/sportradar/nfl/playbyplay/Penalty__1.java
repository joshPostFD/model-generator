
package com.fanduel.modelgenerator.sportradar.nfl.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "result",
    "yards",
    "team"
})
@Generated("jsonschema2pojo")
public class Penalty__1 {

    @JsonProperty("description")
    public String description;
    @JsonProperty("result")
    public String result;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("team")
    public Team__4 team;

}