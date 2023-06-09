package com.fanduel.modelgenerator.generated.sportradar.nba.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Leaders {
    @JsonProperty("rebounds")
    private List<Rebound> rebounds;

    @JsonProperty("assists")
    private List<Assist> assists;

    @JsonProperty("points")
    private List<Point> points;

    public List<Rebound> getRebounds() {
        return Optional.ofNullable(rebounds).orElse(Collections.emptyList());
    }

    public List<Assist> getAssists() {
        return Optional.ofNullable(assists).orElse(Collections.emptyList());
    }

    public List<Point> getPoints() {
        return Optional.ofNullable(points).orElse(Collections.emptyList());
    }
}
