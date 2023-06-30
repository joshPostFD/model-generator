package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Kickoffs {
    @JsonProperty("endzone")
    private Integer endzone;

    @JsonProperty("onside_successes")
    private Integer onsideSuccesses;

    @JsonProperty("return_yards")
    private Integer returnYards;

    @JsonProperty("inside_20")
    private Integer inside20;

    @JsonProperty("kickoffs")
    private Integer kickoffs;

    @JsonProperty("onside_attempts")
    private Integer onsideAttempts;

    @JsonProperty("squib_kicks")
    private Integer squibKicks;

    @JsonProperty("returned")
    private Integer returned;

    @JsonProperty("touchbacks")
    private Integer touchbacks;

    @JsonProperty("out_of_bounds")
    private Integer outOfBounds;

    @JsonProperty("yards")
    private Integer yards;

    public Optional<Integer> getEndzone() {
        return Optional.ofNullable(endzone);
    }

    public Optional<Integer> getOnsideSuccesses() {
        return Optional.ofNullable(onsideSuccesses);
    }

    public Optional<Integer> getReturnYards() {
        return Optional.ofNullable(returnYards);
    }

    public Optional<Integer> getInside20() {
        return Optional.ofNullable(inside20);
    }

    public Optional<Integer> getKickoffs() {
        return Optional.ofNullable(kickoffs);
    }

    public Optional<Integer> getOnsideAttempts() {
        return Optional.ofNullable(onsideAttempts);
    }

    public Optional<Integer> getSquibKicks() {
        return Optional.ofNullable(squibKicks);
    }

    public Optional<Integer> getReturned() {
        return Optional.ofNullable(returned);
    }

    public Optional<Integer> getTouchbacks() {
        return Optional.ofNullable(touchbacks);
    }

    public Optional<Integer> getOutOfBounds() {
        return Optional.ofNullable(outOfBounds);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }
}
