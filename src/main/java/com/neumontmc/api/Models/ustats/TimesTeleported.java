
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
    "amount",
    "worlds",
    "distance"
})
public class TimesTeleported implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("worlds")
    private String worlds;
    @JsonProperty("distance")
    private Double distance;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7385052349516862115L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public TimesTeleported withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("worlds")
    public String getWorlds() {
        return worlds;
    }

    @JsonProperty("worlds")
    public void setWorlds(String worlds) {
        this.worlds = worlds;
    }

    public TimesTeleported withWorlds(String worlds) {
        this.worlds = worlds;
        return this;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public TimesTeleported withDistance(Double distance) {
        this.distance = distance;
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

    public TimesTeleported withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("worlds", worlds).append("distance", distance).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(worlds).append(additionalProperties).append(distance).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimesTeleported) == false) {
            return false;
        }
        TimesTeleported rhs = ((TimesTeleported) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(worlds, rhs.worlds).append(additionalProperties, rhs.additionalProperties).append(distance, rhs.distance).isEquals();
    }

}
