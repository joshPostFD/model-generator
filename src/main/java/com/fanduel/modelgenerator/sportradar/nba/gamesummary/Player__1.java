
package com.fanduel.modelgenerator.sportradar.nba.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "full_name",
    "jersey_number",
    "id",
    "first_name",
    "last_name",
    "position",
    "primary_position",
    "played",
    "active",
    "starter",
    "on_court",
    "sr_id",
    "reference",
    "statistics",
    "not_playing_reason",
    "not_playing_description"
})
@Generated("jsonschema2pojo")
public class Player__1 {

    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("id")
    public String id;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("played")
    public Boolean played;
    @JsonProperty("active")
    public Boolean active;
    @JsonProperty("starter")
    public Boolean starter;
    @JsonProperty("on_court")
    public Boolean onCourt;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("statistics")
    public Statistics__3 statistics;
    @JsonProperty("not_playing_reason")
    public String notPlayingReason;
    @JsonProperty("not_playing_description")
    public String notPlayingDescription;

}