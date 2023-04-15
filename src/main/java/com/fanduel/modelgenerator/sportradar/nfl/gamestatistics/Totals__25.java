
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fumbles",
    "lost_fumbles",
    "own_rec",
    "own_rec_yards",
    "opp_rec",
    "opp_rec_yards",
    "out_of_bounds",
    "forced_fumbles",
    "own_rec_tds",
    "opp_rec_tds",
    "ez_rec_tds"
})
@Generated("jsonschema2pojo")
public class Totals__25 {

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
    @JsonProperty("ez_rec_tds")
    public Integer ezRecTds;

}