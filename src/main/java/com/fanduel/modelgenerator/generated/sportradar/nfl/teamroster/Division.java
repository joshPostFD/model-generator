package com.fanduel.modelgenerator.generated.sportradar.nfl.teamroster;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Division {
    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;
}
