
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
public class LaunchSpinRate {

    @JsonProperty("average")
    public List<Average__7> average = new ArrayList<Average__7>();
    @JsonProperty("max")
    public List<Max__7> max = new ArrayList<Max__7>();

}
