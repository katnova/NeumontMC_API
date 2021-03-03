
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
    "kill_streak",
    "animals"
})
public class AnimalsKilled implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("kill_streak")
    private Long killStreak;
    @JsonProperty("animals")
    private String animals;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3156238681176155493L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public AnimalsKilled withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("kill_streak")
    public Long getKillStreak() {
        return killStreak;
    }

    @JsonProperty("kill_streak")
    public void setKillStreak(Long killStreak) {
        this.killStreak = killStreak;
    }

    public AnimalsKilled withKillStreak(Long killStreak) {
        this.killStreak = killStreak;
        return this;
    }

    @JsonProperty("animals")
    public String getAnimals() {
        return animals;
    }

    @JsonProperty("animals")
    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public AnimalsKilled withAnimals(String animals) {
        this.animals = animals;
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

    public AnimalsKilled withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("killStreak", killStreak).append("animals", animals).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(killStreak).append(amount).append(animals).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnimalsKilled) == false) {
            return false;
        }
        AnimalsKilled rhs = ((AnimalsKilled) other);
        return new EqualsBuilder().append(killStreak, rhs.killStreak).append(amount, rhs.amount).append(animals, rhs.animals).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
