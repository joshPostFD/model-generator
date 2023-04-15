
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "jersey",
    "position",
    "fumbles",
    "lost_fumbles",
    "own_rec",
    "own_rec_yards",
    "opp_rec",
    "opp_rec_yards",
    "out_of_bounds",
    "forced_fumbles",
    "own_rec_tds",
    "opp_rec_tds"
})
@Generated("jsonschema2pojo")
public class Player__9 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("position")
    public String position;
    @JsonProperty("fumbles")
    public Integer fumbles;
    @JsonProperty("lost_fumbles")
    public Integer lostFumbles;
    @JsonProperty("own_rec")
    public Integer ownRec;
    @JsonProperty("own_rec_yards")
    public Integer ownRecYards;
    @JsonProperty("opp_rec")
    public Integer oppRec;
    @JsonProperty("opp_rec_yards")
    public Integer oppRecYards;
    @JsonProperty("out_of_bounds")
    public Integer outOfBounds;
    @JsonProperty("forced_fumbles")
    public Integer forcedFumbles;
    @JsonProperty("own_rec_tds")
    public Integer ownRecTds;
    @JsonProperty("opp_rec_tds")
    public Integer oppRecTds;

}
