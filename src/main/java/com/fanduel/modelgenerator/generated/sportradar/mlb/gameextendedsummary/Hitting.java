package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Hitting {
    @JsonProperty("seasontd")
    private Seasontd seasontd;

    @JsonProperty("overall")
    private Overall overall;
}