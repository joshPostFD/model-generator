
package com.fanduel.modelgenerator.sportradar.nfl.seasonschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "team"
})
@Generated("jsonschema2pojo")
public class ByeWeek {

    @JsonProperty("team")
    public Team team;

}