package com.fanduel.modelgenerator.generated.sportradar.nhl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GameBoxscoreResponse {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("period")
    private Integer period;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("stars")
    private List<Star> stars;

    @JsonProperty("total_game_duration")
    private String totalGameDuration;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("officials")
    private List<Official> officials;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("id")
    private String id;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;
}
