
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "yards",
    "touchdowns",
    "longest_touchdown",
    "blk_fg_touchdowns",
    "blk_punt_touchdowns",
    "fg_return_touchdowns",
    "ez_rec_touchdowns",
    "returns"
})
@Generated("jsonschema2pojo")
public class MiscReturns {

    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;
    @JsonProperty("blk_fg_touchdowns")
    public Integer blkFgTouchdowns;
    @JsonProperty("blk_punt_touchdowns")
    public Integer blkPuntTouchdowns;
    @JsonProperty("fg_return_touchdowns")
    public Integer fgReturnTouchdowns;
    @JsonProperty("ez_rec_touchdowns")
    public Integer ezRecTouchdowns;
    @JsonProperty("returns")
    public Integer returns;

}
