
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "btotal",
    "ktotal",
    "per_ip",
    "per_bf",
    "per_start"
})
@Generated("jsonschema2pojo")
public class Pitches__2 {

    @JsonProperty("count")
    public Integer count;
    @JsonProperty("btotal")
    public Integer btotal;
    @JsonProperty("ktotal")
    public Integer ktotal;
    @JsonProperty("per_ip")
    public java.lang.Double perIp;
    @JsonProperty("per_bf")
    public java.lang.Double perBf;
    @JsonProperty("per_start")
    public java.lang.Double perStart;

}