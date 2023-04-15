
package com.fanduel.modelgenerator.sportradar.nfl.gameroster;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "scheduled",
    "attendance",
    "entry_mode",
    "clock",
    "quarter",
    "sr_id",
    "weather",
    "summary",
    "home",
    "away",
    "officials",
    "_comment"
})
@Generated("jsonschema2pojo")
public class GameRosterResponse {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("scheduled")
    public String scheduled;
    @JsonProperty("attendance")
    public Integer attendance;
    @JsonProperty("entry_mode")
    public String entryMode;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("quarter")
    public Integer quarter;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("weather")
    public Weather weather;
    @JsonProperty("summary")
    public Summary summary;
    @JsonProperty("home")
    public Home__1 home;
    @JsonProperty("away")
    public Away__1 away;
    @JsonProperty("officials")
    public List<Official> officials = new ArrayList<Official>();
    @JsonProperty("_comment")
    public String comment;

}
