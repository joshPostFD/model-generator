
package com.fanduel.modelgenerator.sportradar.mlb.statcastleaders;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "position",
    "primary_position",
    "first_name",
    "last_name",
    "preferred_name",
    "rank",
    "units",
    "hang_time",
    "min",
    "max",
    "count",
    "team",
    "jersey_number"
})
@Generated("jsonschema2pojo")
public class Average__4 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("rank")
    public Integer rank;
    @JsonProperty("units")
    public String units;
    @JsonProperty("hang_time")
    public Double hangTime;
    @JsonProperty("min")
    public Double min;
    @JsonProperty("max")
    public Double max;
    @JsonProperty("count")
    public Integer count;
    @JsonProperty("team")
    public Team__8 team;
    @JsonProperty("jersey_number")
    public String jerseyNumber;

}
