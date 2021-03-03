
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
    "types",
    "worlds"
})
public class WorldsVisited implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("types")
    private String types;
    @JsonProperty("worlds")
    private String worlds;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8524179814870094980L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public WorldsVisited withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("types")
    public String getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(String types) {
        this.types = types;
    }

    public WorldsVisited withTypes(String types) {
        this.types = types;
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

    public WorldsVisited withWorlds(String worlds) {
        this.worlds = worlds;
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

    public WorldsVisited withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("types", types).append("worlds", worlds).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(types).append(worlds).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorldsVisited) == false) {
            return false;
        }
        WorldsVisited rhs = ((WorldsVisited) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(types, rhs.types).append(worlds, rhs.worlds).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
