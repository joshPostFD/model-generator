package com.fanduel.modelgenerator.generated.sportradar.mlb.venues;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class VenuesResponse {
    @JsonProperty("venues")
    private List<Venue> venues;

    @JsonProperty("_comment")
    private String comment;
}