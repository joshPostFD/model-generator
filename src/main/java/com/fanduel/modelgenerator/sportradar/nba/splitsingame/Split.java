
package com.fanduel.modelgenerator.sportradar.nba.splitsingame;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "own_record",
    "opponents"
})
@Generated("jsonschema2pojo")
public class Split {

    @JsonProperty("category")
    public String category;
    @JsonProperty("own_record")
    public OwnRecord ownRecord;
    @JsonProperty("opponents")
    public Opponents opponents;

}