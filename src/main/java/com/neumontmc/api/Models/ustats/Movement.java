
package com.neumontmc.api.Models.ustats;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Distance_Travelled",
    "Times_Teleported",
    "Worlds_Visited"
})
public class Movement implements Serializable
{

    @JsonProperty("Distance_Travelled")
    @Valid
    private DistanceTravelled distanceTravelled;
    @JsonProperty("Times_Teleported")
    @Valid
    private TimesTeleported timesTeleported;
    @JsonProperty("Worlds_Visited")
    @Valid
    private WorldsVisited worldsVisited;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2973877439005727964L;

    @JsonProperty("Distance_Travelled")
    public DistanceTravelled getDistanceTravelled() {
        return distanceTravelled;
    }

    @JsonProperty("Distance_Travelled")
    public void setDistanceTravelled(DistanceTravelled distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public Movement withDistanceTravelled(DistanceTravelled distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
        return this;
    }

    @JsonProperty("Times_Teleported")
    public TimesTeleported getTimesTeleported() {
        return timesTeleported;
    }

    @JsonProperty("Times_Teleported")
    public void setTimesTeleported(TimesTeleported timesTeleported) {
        this.timesTeleported = timesTeleported;
    }

    public Movement withTimesTeleported(TimesTeleported timesTeleported) {
        this.timesTeleported = timesTeleported;
        return this;
    }

    @JsonProperty("Worlds_Visited")
    public WorldsVisited getWorldsVisited() {
        return worldsVisited;
    }

    @JsonProperty("Worlds_Visited")
    public void setWorldsVisited(WorldsVisited worldsVisited) {
        this.worldsVisited = worldsVisited;
    }

    public Movement withWorldsVisited(WorldsVisited worldsVisited) {
        this.worldsVisited = worldsVisited;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Movement withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("distanceTravelled", distanceTravelled).append("timesTeleported", timesTeleported).append("worldsVisited", worldsVisited).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(distanceTravelled).append(timesTeleported).append(worldsVisited).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Movement) == false) {
            return false;
        }
        Movement rhs = ((Movement) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(distanceTravelled, rhs.distanceTravelled).append(timesTeleported, rhs.timesTeleported).append(worldsVisited, rhs.worldsVisited).isEquals();
    }

}
