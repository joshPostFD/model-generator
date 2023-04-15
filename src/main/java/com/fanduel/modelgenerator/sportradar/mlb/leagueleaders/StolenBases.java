
package com.fanduel.modelgenerator.sportradar.mlb.leagueleaders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "players",
    "teams"
})
@Generated("jsonschema2pojo")
public class StolenBases {

    @JsonProperty("players")
    public List<Player__7> players = new ArrayList<Player__7>();
    @JsonProperty("teams")
    public List<Team__15> teams = new ArrayList<Team__15>();

}