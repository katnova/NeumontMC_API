
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
    "Husbandry",
    "Nether",
    "Story",
    "Adventure",
    "End"
})
public class Advancements implements Serializable
{

    @JsonProperty("Husbandry")
    @Valid
    private Husbandry husbandry;
    @JsonProperty("Nether")
    @Valid
    private Nether nether;
    @JsonProperty("Story")
    @Valid
    private Story story;
    @JsonProperty("Adventure")
    @Valid
    private Adventure adventure;
    @JsonProperty("End")
    @Valid
    private End end;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6183059930129155807L;

    @JsonProperty("Husbandry")
    public Husbandry getHusbandry() {
        return husbandry;
    }

    @JsonProperty("Husbandry")
    public void setHusbandry(Husbandry husbandry) {
        this.husbandry = husbandry;
    }

    public Advancements withHusbandry(Husbandry husbandry) {
        this.husbandry = husbandry;
        return this;
    }

    @JsonProperty("Nether")
    public Nether getNether() {
        return nether;
    }

    @JsonProperty("Nether")
    public void setNether(Nether nether) {
        this.nether = nether;
    }

    public Advancements withNether(Nether nether) {
        this.nether = nether;
        return this;
    }

    @JsonProperty("Story")
    public Story getStory() {
        return story;
    }

    @JsonProperty("Story")
    public void setStory(Story story) {
        this.story = story;
    }

    public Advancements withStory(Story story) {
        this.story = story;
        return this;
    }

    @JsonProperty("Adventure")
    public Adventure getAdventure() {
        return adventure;
    }

    @JsonProperty("Adventure")
    public void setAdventure(Adventure adventure) {
        this.adventure = adventure;
    }

    public Advancements withAdventure(Adventure adventure) {
        this.adventure = adventure;
        return this;
    }

    @JsonProperty("End")
    public End getEnd() {
        return end;
    }

    @JsonProperty("End")
    public void setEnd(End end) {
        this.end = end;
    }

    public Advancements withEnd(End end) {
        this.end = end;
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

    public Advancements withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("husbandry", husbandry).append("nether", nether).append("story", story).append("adventure", adventure).append("end", end).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(adventure).append(nether).append(husbandry).append(end).append(additionalProperties).append(story).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Advancements) == false) {
            return false;
        }
        Advancements rhs = ((Advancements) other);
        return new EqualsBuilder().append(adventure, rhs.adventure).append(nether, rhs.nether).append(husbandry, rhs.husbandry).append(end, rhs.end).append(additionalProperties, rhs.additionalProperties).append(story, rhs.story).isEquals();
    }

}
