package com.fanduel.modelgenerator.generated.sportradar.mlb.dailychangelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Standing {
    @JsonProperty("market")
    private String market;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_modified")
    private String lastModified;

    @JsonProperty("abbr")
    private String abbr;
}
