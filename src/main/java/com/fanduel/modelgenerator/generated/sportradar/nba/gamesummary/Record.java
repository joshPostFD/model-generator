package com.fanduel.modelgenerator.generated.sportradar.nba.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Record {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("losses")
    private Integer losses;
}
