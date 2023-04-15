
package com.fanduel.modelgenerator.sportradar.mlb.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "svo",
    "qstart",
    "shutout",
    "team_shutout",
    "complete",
    "win",
    "loss",
    "save",
    "hold",
    "blown_save"
})
@Generated("jsonschema2pojo")
public class Games__2 {

    @JsonProperty("svo")
    public Integer svo;
    @JsonProperty("qstart")
    public Integer qstart;
    @JsonProperty("shutout")
    public Integer shutout;
    @JsonProperty("team_shutout")
    public Integer teamShutout;
    @JsonProperty("complete")
    public Integer complete;
    @JsonProperty("win")
    public Integer win;
    @JsonProperty("loss")
    public Integer loss;
    @JsonProperty("save")
    public Integer save;
    @JsonProperty("hold")
    public Integer hold;
    @JsonProperty("blown_save")
    public Integer blownSave;

}