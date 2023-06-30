package com.fanduel.modelgenerator.generated.sportradar.mlb.seriessummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Fielding {
    @JsonProperty("overall")
    private Overall overall;

    public Optional<Overall> getOverall() {
        return Optional.ofNullable(overall);
    }
}
