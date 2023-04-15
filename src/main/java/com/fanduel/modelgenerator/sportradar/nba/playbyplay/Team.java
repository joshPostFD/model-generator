
package com.fanduel.modelgenerator.sportradar.nba.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "market",
    "id",
    "sr_id",
    "reference"
})
@Generated("jsonschema2pojo")
public class Team {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("id")
    public String id;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("reference")
    public String reference;

}