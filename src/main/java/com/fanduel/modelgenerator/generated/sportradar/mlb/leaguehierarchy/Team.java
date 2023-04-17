package com.fanduel.modelgenerator.generated.sportradar.mlb.leaguehierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Team {
    @JsonProperty("market")
    private String market;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;
}
