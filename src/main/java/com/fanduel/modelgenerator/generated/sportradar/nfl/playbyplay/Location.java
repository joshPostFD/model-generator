package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Location {
    @JsonProperty("market")
    private String market;

    @JsonProperty("lng")
    private String lng;

    @JsonProperty("name")
    private String name;

    @JsonProperty("yardline")
    private Integer yardline;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lat")
    private String lat;

    @JsonProperty("sr_id")
    private String srId;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getLng() {
        return Optional.ofNullable(lng);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getYardline() {
        return Optional.ofNullable(yardline);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getLat() {
        return Optional.ofNullable(lat);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}
