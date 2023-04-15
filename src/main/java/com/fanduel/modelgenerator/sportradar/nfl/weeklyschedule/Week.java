
package com.fanduel.modelgenerator.sportradar.nfl.weeklyschedule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "sequence",
    "title",
    "games"
})
@Generated("jsonschema2pojo")
public class Week {

    @JsonProperty("id")
    public String id;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("title")
    public String title;
    @JsonProperty("games")
    public List<Game> games = new ArrayList<Game>();

}
