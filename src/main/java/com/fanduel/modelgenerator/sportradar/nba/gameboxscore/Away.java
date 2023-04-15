
package com.fanduel.modelgenerator.sportradar.nba.gameboxscore;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "alias",
    "market",
    "id",
    "points",
    "bonus",
    "sr_id",
    "remaining_timeouts",
    "reference",
    "record",
    "scoring",
    "leaders"
})
@Generated("jsonschema2pojo")
public class Away {

    @JsonProperty("name")
    public String name;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("market")
    public String market;
    @JsonProperty("id")
    public String id;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("bonus")
    public Boolean bonus;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("remaining_timeouts")
    public Integer remainingTimeouts;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("record")
    public Record__1 record;
    @JsonProperty("scoring")
    public List<Scoring__1> scoring = new ArrayList<Scoring__1>();
    @JsonProperty("leaders")
    public Leaders__1 leaders;

}
