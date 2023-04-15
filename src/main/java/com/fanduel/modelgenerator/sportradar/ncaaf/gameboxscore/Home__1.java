
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "alias",
    "remaining_timeouts",
    "points",
    "remaining_challenges",
    "record"
})
@Generated("jsonschema2pojo")
public class Home__1 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("remaining_timeouts")
    public Integer remainingTimeouts;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("remaining_challenges")
    public Integer remainingChallenges;
    @JsonProperty("record")
    public Record record;

}