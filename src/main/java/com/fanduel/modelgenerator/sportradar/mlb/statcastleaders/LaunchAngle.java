
package com.fanduel.modelgenerator.sportradar.mlb.statcastleaders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "average",
    "max"
})
@Generated("jsonschema2pojo")
public class LaunchAngle {

    @JsonProperty("average")
    public List<Average__1> average = new ArrayList<Average__1>();
    @JsonProperty("max")
    public List<Max__1> max = new ArrayList<Max__1>();

}