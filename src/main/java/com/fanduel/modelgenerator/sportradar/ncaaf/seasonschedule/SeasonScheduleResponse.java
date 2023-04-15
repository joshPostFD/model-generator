
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonschedule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "year",
    "type",
    "name",
    "weeks",
    "_comment"
})
@Generated("jsonschema2pojo")
public class SeasonScheduleResponse {

    @JsonProperty("id")
    public String id;
    @JsonProperty("year")
    public Integer year;
    @JsonProperty("type")
    public String type;
    @JsonProperty("name")
    public String name;
    @JsonProperty("weeks")
    public List<Week> weeks = new ArrayList<Week>();
    @JsonProperty("_comment")
    public String comment;

}
