package com.fanduel.modelgenerator.generated.sportradar.nba.splitshierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SplitsHierarchyResponse {
    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("splits")
    private List<Split> splits;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("name")
    private String name;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;
}