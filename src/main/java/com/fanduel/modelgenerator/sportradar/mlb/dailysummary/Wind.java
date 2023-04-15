
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed_mph",
    "direction"
})
@Generated("jsonschema2pojo")
public class Wind {

    @JsonProperty("speed_mph")
    public Integer speedMph;
    @JsonProperty("direction")
    public String direction;

}