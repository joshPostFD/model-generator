
package com.fanduel.modelgenerator.sportradar.nba.leaguehierarchy;

import java.util.ArrayList;
import java.util.List;
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
    "reference",
    "team_colors",
    "venue"
})
@Generated("jsonschema2pojo")
public class Team {

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
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("team_colors")
    public List<TeamColor> teamColors = new ArrayList<TeamColor>();
    @JsonProperty("venue")
    public Venue venue;

}