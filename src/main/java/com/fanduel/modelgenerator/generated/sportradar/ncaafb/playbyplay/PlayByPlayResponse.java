package com.fanduel.modelgenerator.generated.sportradar.ncaafb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class PlayByPlayResponse {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("game_type")
    private String gameType;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("periods")
    private List<Period> periods;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;

    @JsonProperty("quarter")
    private Integer quarter;

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
    }

    public Optional<Summary> getSummary() {
        return Optional.ofNullable(summary);
    }

    public Optional<String> getGameType() {
        return Optional.ofNullable(gameType);
    }

    public Optional<String> getScheduled() {
        return Optional.ofNullable(scheduled);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<Weather> getWeather() {
        return Optional.ofNullable(weather);
    }

    public List<Period> getPeriods() {
        return Optional.ofNullable(periods).orElse(Collections.emptyList());
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getAttendance() {
        return Optional.ofNullable(attendance);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<String> getEntryMode() {
        return Optional.ofNullable(entryMode);
    }

    public Optional<Integer> getQuarter() {
        return Optional.ofNullable(quarter);
    }
}
