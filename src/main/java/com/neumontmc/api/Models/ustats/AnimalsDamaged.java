
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
    "items_used",
    "animals"
})
public class AnimalsDamaged implements Serializable
{

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("items_used")
    private String itemsUsed;
    @JsonProperty("animals")
    private String animals;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3240993152951891555L;

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AnimalsDamaged withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("items_used")
    public String getItemsUsed() {
        return itemsUsed;
    }

    @JsonProperty("items_used")
    public void setItemsUsed(String itemsUsed) {
        this.itemsUsed = itemsUsed;
    }

    public AnimalsDamaged withItemsUsed(String itemsUsed) {
        this.itemsUsed = itemsUsed;
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

    public AnimalsDamaged withAnimals(String animals) {
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

    public AnimalsDamaged withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("itemsUsed", itemsUsed).append("animals", animals).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(itemsUsed).append(amount).append(animals).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnimalsDamaged) == false) {
            return false;
        }
        AnimalsDamaged rhs = ((AnimalsDamaged) other);
        return new EqualsBuilder().append(itemsUsed, rhs.itemsUsed).append(amount, rhs.amount).append(animals, rhs.animals).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
