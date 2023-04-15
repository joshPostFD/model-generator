
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totals",
    "players"
})
@Generated("jsonschema2pojo")
public class Penalties__1 {

    @JsonProperty("totals")
    public Totals__19 totals;
    @JsonProperty("players")
    public List<Player__16> players = new ArrayList<Player__16>();

}
