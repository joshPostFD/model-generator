package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersgoaltending;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class LeagueLeadersGoaltendingResponse {
    @JsonProperty("season")
    private Season season;

    @JsonProperty("categories")
    private List<Category> categories;

    @JsonProperty("type")
    private String type;
}
