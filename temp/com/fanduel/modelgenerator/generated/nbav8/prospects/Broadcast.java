package com.fanduel.modelgenerator.generated.nbav8.prospects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class Broadcast {
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("network")
    private String network;

    public Optional<String> getChannel() {
        return Optional.ofNullable(channel);
    }

    public Optional<String> getNetwork() {
        return Optional.ofNullable(network);
    }
}
