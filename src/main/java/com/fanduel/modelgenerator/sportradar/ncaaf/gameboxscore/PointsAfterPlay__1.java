
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "sequence",
    "type"
})
@Generated("jsonschema2pojo")
public class PointsAfterPlay__1 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("sequence")
    public Double sequence;
    @JsonProperty("type")
    public String type;

}