
package com.fanduel.modelgenerator.sportradar.nba.seasonalstatisticsseasontodate;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "full_name",
    "first_name",
    "last_name",
    "position",
    "primary_position",
    "jersey_number",
    "sr_id",
    "reference",
    "total",
    "average",
    "name_suffix"
})
@Generated("jsonschema2pojo")
public class Player {

    @JsonProperty("id")
    public String id;
    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("total")
    public Total__2 total;
    @JsonProperty("average")
    public Average__2 average;
    @JsonProperty("name_suffix")
    public String nameSuffix;

}
