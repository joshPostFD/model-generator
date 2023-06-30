package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
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
public class Game {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("broadcast")
    private Broadcast broadcast;

    @JsonProperty("double_header")
    private Boolean doubleHeader;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("game")
    private Game game;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("away_team")
    private String awayTeam;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("rescheduled")
    private List<Rescheduled> rescheduled;

    @JsonProperty("pitching")
    private Pitching pitching;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("day_night")
    private String dayNight;

    @JsonProperty("game_number")
    private Integer gameNumber;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("home_team")
    private String homeTeam;

    @JsonProperty("id")
    private String id;

    @JsonProperty("time_zones")
    private TimeZones timeZones;

    @JsonProperty("final")
    private Final _final;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
    }

    public Optional<Broadcast> getBroadcast() {
        return Optional.ofNullable(broadcast);
    }

    public Optional<Boolean> getDoubleHeader() {
        return Optional.ofNullable(doubleHeader);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Game> getGame() {
        return Optional.ofNullable(game);
    }

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<String> getAwayTeam() {
        return Optional.ofNullable(awayTeam);
    }

    public Optional<String> getScheduled() {
        return Optional.ofNullable(scheduled);
    }

    public List<Rescheduled> getRescheduled() {
        return Optional.ofNullable(rescheduled).orElse(Collections.emptyList());
    }

    public Optional<Pitching> getPitching() {
        return Optional.ofNullable(pitching);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getDayNight() {
        return Optional.ofNullable(dayNight);
    }

    public Optional<Integer> getGameNumber() {
        return Optional.ofNullable(gameNumber);
    }

    public Optional<Weather> getWeather() {
        return Optional.ofNullable(weather);
    }

    public Optional<String> getHomeTeam() {
        return Optional.ofNullable(homeTeam);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<TimeZones> getTimeZones() {
        return Optional.ofNullable(timeZones);
    }

    public Optional<Final> get_final() {
        return Optional.ofNullable(_final);
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
}
