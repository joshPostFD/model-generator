package com.fanduel.modelgenerator.generated.sportradar.nba.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GameBoxscoreResponse {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("times_tied")
    private Integer timesTied;

    @JsonProperty("clock_decimal")
    private String clockDecimal;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("track_on_court")
    private Boolean trackOnCourt;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lead_changes")
    private Integer leadChanges;

    @JsonProperty("time_zones")
    private TimeZones timeZones;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("quarter")
    private Integer quarter;

    @JsonProperty("entry_mode")
    private String entryMode;
}
