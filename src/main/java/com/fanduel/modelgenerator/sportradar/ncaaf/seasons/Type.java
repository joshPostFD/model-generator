
package com.fanduel.modelgenerator.sportradar.ncaaf.seasons;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code"
})
@Generated("jsonschema2pojo")
public class Type {

    @JsonProperty("code")
    public String code;

}