
package com.fanduel.modelgenerator.sportradar.mlb.statcastleaders;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "position",
    "primary_position",
    "first_name",
    "last_name",
    "preferred_name",
    "jersey_number",
    "rank",
    "units",
    "game_id",
    "travel_distance",
    "team",
    "opposing_player"
})
@Generated("jsonschema2pojo")
public class Max__5 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("rank")
    public Integer rank;
    @JsonProperty("units")
    public String units;
    @JsonProperty("game_id")
    public String gameId;
    @JsonProperty("travel_distance")
    public Double travelDistance;
    @JsonProperty("team")
    public Team__11 team;
    @JsonProperty("opposing_player")
    public OpposingPlayer__5 opposingPlayer;

}
