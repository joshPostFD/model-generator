package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("injuries")
    private List<Injury> injuries;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("sr_id")
    private String srId;
}