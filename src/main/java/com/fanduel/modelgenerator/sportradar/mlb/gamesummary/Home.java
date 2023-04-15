
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "market",
    "abbr",
    "id",
    "runs",
    "hits",
    "errors",
    "win",
    "loss",
    "probable_pitcher",
    "starting_pitcher",
    "roster",
    "lineup",
    "scoring",
    "statistics",
    "players"
})
@Generated("jsonschema2pojo")
public class Home {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("abbr")
    public String abbr;
    @JsonProperty("id")
    public String id;
    @JsonProperty("runs")
    public Integer runs;
    @JsonProperty("hits")
    public Integer hits;
    @JsonProperty("errors")
    public Integer errors;
    @JsonProperty("win")
    public Integer win;
    @JsonProperty("loss")
    public Integer loss;
    @JsonProperty("probable_pitcher")
    public ProbablePitcher probablePitcher;
    @JsonProperty("starting_pitcher")
    public StartingPitcher startingPitcher;
    @JsonProperty("roster")
    public List<Roster> roster = new ArrayList<Roster>();
    @JsonProperty("lineup")
    public List<Lineup> lineup = new ArrayList<Lineup>();
    @JsonProperty("scoring")
    public List<Scoring> scoring = new ArrayList<Scoring>();
    @JsonProperty("statistics")
    public Statistics statistics;
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();

}