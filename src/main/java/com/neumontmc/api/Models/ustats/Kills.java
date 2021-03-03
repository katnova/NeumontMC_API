
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
    "Animals_Killed",
    "Mobs_Killed",
    "Villagers_Killed",
    "Players_Killed"
})
public class Kills implements Serializable
{

    @JsonProperty("Animals_Killed")
    @Valid
    private AnimalsKilled animalsKilled;
    @JsonProperty("Mobs_Killed")
    @Valid
    private MobsKilled mobsKilled;
    @JsonProperty("Villagers_Killed")
    @Valid
    private VillagersKilled villagersKilled;
    @JsonProperty("Players_Killed")
    @Valid
    private PlayersKilled playersKilled;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5270902471205387643L;

    @JsonProperty("Animals_Killed")
    public AnimalsKilled getAnimalsKilled() {
        return animalsKilled;
    }

    @JsonProperty("Animals_Killed")
    public void setAnimalsKilled(AnimalsKilled animalsKilled) {
        this.animalsKilled = animalsKilled;
    }

    public Kills withAnimalsKilled(AnimalsKilled animalsKilled) {
        this.animalsKilled = animalsKilled;
        return this;
    }

    @JsonProperty("Mobs_Killed")
    public MobsKilled getMobsKilled() {
        return mobsKilled;
    }

    @JsonProperty("Mobs_Killed")
    public void setMobsKilled(MobsKilled mobsKilled) {
        this.mobsKilled = mobsKilled;
    }

    public Kills withMobsKilled(MobsKilled mobsKilled) {
        this.mobsKilled = mobsKilled;
        return this;
    }

    @JsonProperty("Villagers_Killed")
    public VillagersKilled getVillagersKilled() {
        return villagersKilled;
    }

    @JsonProperty("Villagers_Killed")
    public void setVillagersKilled(VillagersKilled villagersKilled) {
        this.villagersKilled = villagersKilled;
    }

    public Kills withVillagersKilled(VillagersKilled villagersKilled) {
        this.villagersKilled = villagersKilled;
        return this;
    }

    @JsonProperty("Players_Killed")
    public PlayersKilled getPlayersKilled() {
        return playersKilled;
    }

    @JsonProperty("Players_Killed")
    public void setPlayersKilled(PlayersKilled playersKilled) {
        this.playersKilled = playersKilled;
    }

    public Kills withPlayersKilled(PlayersKilled playersKilled) {
        this.playersKilled = playersKilled;
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

    public Kills withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("animalsKilled", animalsKilled).append("mobsKilled", mobsKilled).append("villagersKilled", villagersKilled).append("playersKilled", playersKilled).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(animalsKilled).append(additionalProperties).append(playersKilled).append(villagersKilled).append(mobsKilled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Kills) == false) {
            return false;
        }
        Kills rhs = ((Kills) other);
        return new EqualsBuilder().append(animalsKilled, rhs.animalsKilled).append(additionalProperties, rhs.additionalProperties).append(playersKilled, rhs.playersKilled).append(villagersKilled, rhs.villagersKilled).append(mobsKilled, rhs.mobsKilled).isEquals();
    }

}
