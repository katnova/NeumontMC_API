
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
    "trapdoors"
})
public class TrapdoorsInteracted implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("trapdoors")
    private String trapdoors;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4011363319011734887L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public TrapdoorsInteracted withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("trapdoors")
    public String getTrapdoors() {
        return trapdoors;
    }

    @JsonProperty("trapdoors")
    public void setTrapdoors(String trapdoors) {
        this.trapdoors = trapdoors;
    }

    public TrapdoorsInteracted withTrapdoors(String trapdoors) {
        this.trapdoors = trapdoors;
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

    public TrapdoorsInteracted withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("trapdoors", trapdoors).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trapdoors).append(amount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrapdoorsInteracted) == false) {
            return false;
        }
        TrapdoorsInteracted rhs = ((TrapdoorsInteracted) other);
        return new EqualsBuilder().append(trapdoors, rhs.trapdoors).append(amount, rhs.amount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
