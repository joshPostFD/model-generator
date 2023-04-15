
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "market",
    "id",
    "runs",
    "hits",
    "errors"
})
@Generated("jsonschema2pojo")
public class Home__1 {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("id")
    public String id;
    @JsonProperty("runs")
    public Integer runs;
    @JsonProperty("hits")
    public Integer hits;
    @JsonProperty("errors")
    public Integer errors;

}
