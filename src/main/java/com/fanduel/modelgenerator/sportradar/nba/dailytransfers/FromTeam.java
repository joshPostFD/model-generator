
package com.fanduel.modelgenerator.sportradar.nba.dailytransfers;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "reference"
})
@Generated("jsonschema2pojo")
public class FromTeam {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("reference")
    public String reference;

}
