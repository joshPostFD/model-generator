
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kicks",
    "conversions"
})
@Generated("jsonschema2pojo")
public class ExtraPoints {

    @JsonProperty("kicks")
    public Kicks kicks;
    @JsonProperty("conversions")
    public Conversions conversions;

}
