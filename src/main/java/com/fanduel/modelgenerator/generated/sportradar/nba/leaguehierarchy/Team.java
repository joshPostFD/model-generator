package com.fanduel.modelgenerator.generated.sportradar.nba.leaguehierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Team {
    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("team_colors")
    private List<TeamColor> teamColors;

    @JsonProperty("sr_id")
    private String srId;
}
