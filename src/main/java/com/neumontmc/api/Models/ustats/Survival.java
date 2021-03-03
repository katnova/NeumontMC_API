
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
    "Hearts_Lost",
    "Hearts_Regained",
    "Foods_Eaten",
    "Armors_Worn"
})
public class Survival implements Serializable
{

    @JsonProperty("Hearts_Lost")
    @Valid
    private HeartsLost heartsLost;
    @JsonProperty("Hearts_Regained")
    @Valid
    private HeartsRegained heartsRegained;
    @JsonProperty("Foods_Eaten")
    @Valid
    private FoodsEaten foodsEaten;
    @JsonProperty("Armors_Worn")
    @Valid
    private ArmorsWorn armorsWorn;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6113062378280635726L;

    @JsonProperty("Hearts_Lost")
    public HeartsLost getHeartsLost() {
        return heartsLost;
    }

    @JsonProperty("Hearts_Lost")
    public void setHeartsLost(HeartsLost heartsLost) {
        this.heartsLost = heartsLost;
    }

    public Survival withHeartsLost(HeartsLost heartsLost) {
        this.heartsLost = heartsLost;
        return this;
    }

    @JsonProperty("Hearts_Regained")
    public HeartsRegained getHeartsRegained() {
        return heartsRegained;
    }

    @JsonProperty("Hearts_Regained")
    public void setHeartsRegained(HeartsRegained heartsRegained) {
        this.heartsRegained = heartsRegained;
    }

    public Survival withHeartsRegained(HeartsRegained heartsRegained) {
        this.heartsRegained = heartsRegained;
        return this;
    }

    @JsonProperty("Foods_Eaten")
    public FoodsEaten getFoodsEaten() {
        return foodsEaten;
    }

    @JsonProperty("Foods_Eaten")
    public void setFoodsEaten(FoodsEaten foodsEaten) {
        this.foodsEaten = foodsEaten;
    }

    public Survival withFoodsEaten(FoodsEaten foodsEaten) {
        this.foodsEaten = foodsEaten;
        return this;
    }

    @JsonProperty("Armors_Worn")
    public ArmorsWorn getArmorsWorn() {
        return armorsWorn;
    }

    @JsonProperty("Armors_Worn")
    public void setArmorsWorn(ArmorsWorn armorsWorn) {
        this.armorsWorn = armorsWorn;
    }

    public Survival withArmorsWorn(ArmorsWorn armorsWorn) {
        this.armorsWorn = armorsWorn;
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

    public Survival withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("heartsLost", heartsLost).append("heartsRegained", heartsRegained).append("foodsEaten", foodsEaten).append("armorsWorn", armorsWorn).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(heartsLost).append(additionalProperties).append(foodsEaten).append(heartsRegained).append(armorsWorn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Survival) == false) {
            return false;
        }
        Survival rhs = ((Survival) other);
        return new EqualsBuilder().append(heartsLost, rhs.heartsLost).append(additionalProperties, rhs.additionalProperties).append(foodsEaten, rhs.foodsEaten).append(heartsRegained, rhs.heartsRegained).append(armorsWorn, rhs.armorsWorn).isEquals();
    }

}
