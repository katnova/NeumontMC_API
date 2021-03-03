
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
    "Deaths_By_Suicide",
    "Deaths_By_Mobs",
    "Deaths_By_Player"
})
public class Deaths implements Serializable
{

    @JsonProperty("Deaths_By_Suicide")
    @Valid
    private DeathsBySuicide deathsBySuicide;
    @JsonProperty("Deaths_By_Mobs")
    @Valid
    private DeathsByMobs deathsByMobs;
    @JsonProperty("Deaths_By_Player")
    @Valid
    private DeathsByPlayer deathsByPlayer;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5272414090536450687L;

    @JsonProperty("Deaths_By_Suicide")
    public DeathsBySuicide getDeathsBySuicide() {
        return deathsBySuicide;
    }

    @JsonProperty("Deaths_By_Suicide")
    public void setDeathsBySuicide(DeathsBySuicide deathsBySuicide) {
        this.deathsBySuicide = deathsBySuicide;
    }

    public Deaths withDeathsBySuicide(DeathsBySuicide deathsBySuicide) {
        this.deathsBySuicide = deathsBySuicide;
        return this;
    }

    @JsonProperty("Deaths_By_Mobs")
    public DeathsByMobs getDeathsByMobs() {
        return deathsByMobs;
    }

    @JsonProperty("Deaths_By_Mobs")
    public void setDeathsByMobs(DeathsByMobs deathsByMobs) {
        this.deathsByMobs = deathsByMobs;
    }

    public Deaths withDeathsByMobs(DeathsByMobs deathsByMobs) {
        this.deathsByMobs = deathsByMobs;
        return this;
    }

    @JsonProperty("Deaths_By_Player")
    public DeathsByPlayer getDeathsByPlayer() {
        return deathsByPlayer;
    }

    @JsonProperty("Deaths_By_Player")
    public void setDeathsByPlayer(DeathsByPlayer deathsByPlayer) {
        this.deathsByPlayer = deathsByPlayer;
    }

    public Deaths withDeathsByPlayer(DeathsByPlayer deathsByPlayer) {
        this.deathsByPlayer = deathsByPlayer;
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

    public Deaths withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deathsBySuicide", deathsBySuicide).append("deathsByMobs", deathsByMobs).append("deathsByPlayer", deathsByPlayer).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deathsByMobs).append(additionalProperties).append(deathsByPlayer).append(deathsBySuicide).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Deaths) == false) {
            return false;
        }
        Deaths rhs = ((Deaths) other);
        return new EqualsBuilder().append(deathsByMobs, rhs.deathsByMobs).append(additionalProperties, rhs.additionalProperties).append(deathsByPlayer, rhs.deathsByPlayer).append(deathsBySuicide, rhs.deathsBySuicide).isEquals();
    }

}
