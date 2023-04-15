
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "scheduled",
    "attendance",
    "entry_mode",
    "clock",
    "quarter",
    "coverage",
    "game_type",
    "weather",
    "summary",
    "statistics",
    "_comment"
})
@Generated("jsonschema2pojo")
public class GameStatisticsResponse {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("scheduled")
    public String scheduled;
    @JsonProperty("attendance")
    public Integer attendance;
    @JsonProperty("entry_mode")
    public String entryMode;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("quarter")
    public Integer quarter;
    @JsonProperty("coverage")
    public String coverage;
    @JsonProperty("game_type")
    public String gameType;
    @JsonProperty("weather")
    public Weather weather;
    @JsonProperty("summary")
    public Summary summary;
    @JsonProperty("statistics")
    public Statistics statistics;
    @JsonProperty("_comment")
    public String comment;

}
