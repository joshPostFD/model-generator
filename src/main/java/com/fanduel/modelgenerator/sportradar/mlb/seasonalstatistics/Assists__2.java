
package com.fanduel.modelgenerator.sportradar.mlb.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outfield",
    "total"
})
@Generated("jsonschema2pojo")
public class Assists__2 {

    @JsonProperty("outfield")
    public Integer outfield;
    @JsonProperty("total")
    public Integer total;

}
