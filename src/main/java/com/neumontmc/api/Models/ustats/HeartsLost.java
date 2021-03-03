
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
    "reasons"
})
public class HeartsLost implements Serializable
{

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("reasons")
    private String reasons;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2338097368036009660L;

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public HeartsLost withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("reasons")
    public String getReasons() {
        return reasons;
    }

    @JsonProperty("reasons")
    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public HeartsLost withReasons(String reasons) {
        this.reasons = reasons;
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

    public HeartsLost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("reasons", reasons).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(reasons).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HeartsLost) == false) {
            return false;
        }
        HeartsLost rhs = ((HeartsLost) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(reasons, rhs.reasons).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
