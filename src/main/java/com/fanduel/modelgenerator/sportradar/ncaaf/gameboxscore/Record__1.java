
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wins",
    "losses",
    "ties"
})
@Generated("jsonschema2pojo")
public class Record__1 {

    @JsonProperty("wins")
    public Integer wins;
    @JsonProperty("losses")
    public Integer losses;
    @JsonProperty("ties")
    public Integer ties;

}