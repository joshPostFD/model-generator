
package com.fanduel.modelgenerator.sportradar.nfl.playerprofile;

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
    "sr_id",
    "statistics"
})
@Generated("jsonschema2pojo")
public class Team__1 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("statistics")
    public Statistics statistics;

}
