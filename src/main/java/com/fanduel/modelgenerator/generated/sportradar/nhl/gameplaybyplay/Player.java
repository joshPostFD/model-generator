package com.fanduel.modelgenerator.generated.sportradar.nhl.gameplaybyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;
}
