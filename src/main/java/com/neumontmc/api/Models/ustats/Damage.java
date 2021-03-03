
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
    "Mobs_Damaged",
    "Animals_Damaged",
    "Villagers_Damaged",
    "Players_Damaged"
})
public class Damage implements Serializable
{

    @JsonProperty("Mobs_Damaged")
    @Valid
    private MobsDamaged mobsDamaged;
    @JsonProperty("Animals_Damaged")
    @Valid
    private AnimalsDamaged animalsDamaged;
    @JsonProperty("Villagers_Damaged")
    @Valid
    private VillagersDamaged villagersDamaged;
    @JsonProperty("Players_Damaged")
    @Valid
    private PlayersDamaged playersDamaged;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 508243052954416341L;

    @JsonProperty("Mobs_Damaged")
    public MobsDamaged getMobsDamaged() {
        return mobsDamaged;
    }

    @JsonProperty("Mobs_Damaged")
    public void setMobsDamaged(MobsDamaged mobsDamaged) {
        this.mobsDamaged = mobsDamaged;
    }

    public Damage withMobsDamaged(MobsDamaged mobsDamaged) {
        this.mobsDamaged = mobsDamaged;
        return this;
    }

    @JsonProperty("Animals_Damaged")
    public AnimalsDamaged getAnimalsDamaged() {
        return animalsDamaged;
    }

    @JsonProperty("Animals_Damaged")
    public void setAnimalsDamaged(AnimalsDamaged animalsDamaged) {
        this.animalsDamaged = animalsDamaged;
    }

    public Damage withAnimalsDamaged(AnimalsDamaged animalsDamaged) {
        this.animalsDamaged = animalsDamaged;
        return this;
    }

    @JsonProperty("Villagers_Damaged")
    public VillagersDamaged getVillagersDamaged() {
        return villagersDamaged;
    }

    @JsonProperty("Villagers_Damaged")
    public void setVillagersDamaged(VillagersDamaged villagersDamaged) {
        this.villagersDamaged = villagersDamaged;
    }

    public Damage withVillagersDamaged(VillagersDamaged villagersDamaged) {
        this.villagersDamaged = villagersDamaged;
        return this;
    }

    @JsonProperty("Players_Damaged")
    public PlayersDamaged getPlayersDamaged() {
        return playersDamaged;
    }

    @JsonProperty("Players_Damaged")
    public void setPlayersDamaged(PlayersDamaged playersDamaged) {
        this.playersDamaged = playersDamaged;
    }

    public Damage withPlayersDamaged(PlayersDamaged playersDamaged) {
        this.playersDamaged = playersDamaged;
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

    public Damage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mobsDamaged", mobsDamaged).append("animalsDamaged", animalsDamaged).append("villagersDamaged", villagersDamaged).append("playersDamaged", playersDamaged).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(villagersDamaged).append(additionalProperties).append(animalsDamaged).append(mobsDamaged).append(playersDamaged).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Damage) == false) {
            return false;
        }
        Damage rhs = ((Damage) other);
        return new EqualsBuilder().append(villagersDamaged, rhs.villagersDamaged).append(additionalProperties, rhs.additionalProperties).append(animalsDamaged, rhs.animalsDamaged).append(mobsDamaged, rhs.mobsDamaged).append(playersDamaged, rhs.playersDamaged).isEquals();
    }

}
