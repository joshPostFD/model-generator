
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "penalties",
    "yards"
})
@Generated("jsonschema2pojo")
public class Penalties__1 {

    @JsonProperty("penalties")
    public Integer penalties;
    @JsonProperty("yards")
    public Integer yards;

}
