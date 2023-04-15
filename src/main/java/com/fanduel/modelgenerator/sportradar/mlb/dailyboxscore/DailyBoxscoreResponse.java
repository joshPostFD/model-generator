
package com.fanduel.modelgenerator.sportradar.mlb.dailyboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "_comment"
})
@Generated("jsonschema2pojo")
public class DailyBoxscoreResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("_comment")
    public String comment;

}
