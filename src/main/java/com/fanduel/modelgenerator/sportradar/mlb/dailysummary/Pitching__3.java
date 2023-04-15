
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overall",
    "starters",
    "bullpen"
})
@Generated("jsonschema2pojo")
public class Pitching__3 {

    @JsonProperty("overall")
    public Overall__11 overall;
    @JsonProperty("starters")
    public Starters__3 starters;
    @JsonProperty("bullpen")
    public Bullpen__3 bullpen;

}