
package com.fanduel.modelgenerator.sportradar.nfl.teamdraftsummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "number",
    "overall",
    "team",
    "prospect",
    "traded",
    "trades"
})
@Generated("jsonschema2pojo")
public class Pick {

    @JsonProperty("id")
    public String id;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("overall")
    public Integer overall;
    @JsonProperty("team")
    public Team__1 team;
    @JsonProperty("prospect")
    public Prospect prospect;
    @JsonProperty("traded")
    public Boolean traded;
    @JsonProperty("trades")
    public List<Trade> trades = new ArrayList<Trade>();

}
