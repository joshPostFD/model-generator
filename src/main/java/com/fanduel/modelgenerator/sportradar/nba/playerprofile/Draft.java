
package com.fanduel.modelgenerator.sportradar.nba.playerprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "team_id",
    "year",
    "round",
    "pick"
})
@Generated("jsonschema2pojo")
public class Draft {

    @JsonProperty("team_id")
    public String teamId;
    @JsonProperty("year")
    public Integer year;
    @JsonProperty("round")
    public String round;
    @JsonProperty("pick")
    public String pick;

}