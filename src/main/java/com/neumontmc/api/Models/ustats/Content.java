
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
    "Activity",
    "Movement",
    "World",
    "Moderation",
    "Survival",
    "Deaths",
    "Inventory",
    "Interactions",
    "Accuracy",
    "Advancements",
    "Damage",
    "Kills"
})
public class Content implements Serializable
{

    @JsonProperty("Activity")
    @Valid
    private Activity activity;
    @JsonProperty("Movement")
    @Valid
    private Movement movement;
    @JsonProperty("World")
    @Valid
    private World world;
    @JsonProperty("Moderation")
    @Valid
    private Moderation moderation;
    @JsonProperty("Survival")
    @Valid
    private Survival survival;
    @JsonProperty("Deaths")
    @Valid
    private Deaths deaths;
    @JsonProperty("Inventory")
    @Valid
    private Inventory inventory;
    @JsonProperty("Interactions")
    @Valid
    private Interactions interactions;
    @JsonProperty("Accuracy")
    @Valid
    private Accuracy accuracy;
    @JsonProperty("Advancements")
    @Valid
    private Advancements advancements;
    @JsonProperty("Damage")
    @Valid
    private Damage damage;
    @JsonProperty("Kills")
    @Valid
    private Kills kills;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5288815674749314332L;

    @JsonProperty("Activity")
    public Activity getActivity() {
        return activity;
    }

    @JsonProperty("Activity")
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Content withActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    @JsonProperty("Movement")
    public Movement getMovement() {
        return movement;
    }

    @JsonProperty("Movement")
    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Content withMovement(Movement movement) {
        this.movement = movement;
        return this;
    }

    @JsonProperty("World")
    public World getWorld() {
        return world;
    }

    @JsonProperty("World")
    public void setWorld(World world) {
        this.world = world;
    }

    public Content withWorld(World world) {
        this.world = world;
        return this;
    }

    @JsonProperty("Moderation")
    public Moderation getModeration() {
        return moderation;
    }

    @JsonProperty("Moderation")
    public void setModeration(Moderation moderation) {
        this.moderation = moderation;
    }

    public Content withModeration(Moderation moderation) {
        this.moderation = moderation;
        return this;
    }

    @JsonProperty("Survival")
    public Survival getSurvival() {
        return survival;
    }

    @JsonProperty("Survival")
    public void setSurvival(Survival survival) {
        this.survival = survival;
    }

    public Content withSurvival(Survival survival) {
        this.survival = survival;
        return this;
    }

    @JsonProperty("Deaths")
    public Deaths getDeaths() {
        return deaths;
    }

    @JsonProperty("Deaths")
    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public Content withDeaths(Deaths deaths) {
        this.deaths = deaths;
        return this;
    }

    @JsonProperty("Inventory")
    public Inventory getInventory() {
        return inventory;
    }

    @JsonProperty("Inventory")
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Content withInventory(Inventory inventory) {
        this.inventory = inventory;
        return this;
    }

    @JsonProperty("Interactions")
    public Interactions getInteractions() {
        return interactions;
    }

    @JsonProperty("Interactions")
    public void setInteractions(Interactions interactions) {
        this.interactions = interactions;
    }

    public Content withInteractions(Interactions interactions) {
        this.interactions = interactions;
        return this;
    }

    @JsonProperty("Accuracy")
    public Accuracy getAccuracy() {
        return accuracy;
    }

    @JsonProperty("Accuracy")
    public void setAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    public Content withAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    @JsonProperty("Advancements")
    public Advancements getAdvancements() {
        return advancements;
    }

    @JsonProperty("Advancements")
    public void setAdvancements(Advancements advancements) {
        this.advancements = advancements;
    }

    public Content withAdvancements(Advancements advancements) {
        this.advancements = advancements;
        return this;
    }

    @JsonProperty("Damage")
    public Damage getDamage() {
        return damage;
    }

    @JsonProperty("Damage")
    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public Content withDamage(Damage damage) {
        this.damage = damage;
        return this;
    }

    @JsonProperty("Kills")
    public Kills getKills() {
        return kills;
    }

    @JsonProperty("Kills")
    public void setKills(Kills kills) {
        this.kills = kills;
    }

    public Content withKills(Kills kills) {
        this.kills = kills;
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

    public Content withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("activity", activity).append("movement", movement).append("world", world).append("moderation", moderation).append("survival", survival).append("deaths", deaths).append("inventory", inventory).append("interactions", interactions).append("accuracy", accuracy).append("advancements", advancements).append("damage", damage).append("kills", kills).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kills).append(damage).append(activity).append(survival).append(accuracy).append(inventory).append(interactions).append(world).append(advancements).append(moderation).append(additionalProperties).append(movement).append(deaths).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content) == false) {
            return false;
        }
        Content rhs = ((Content) other);
        return new EqualsBuilder().append(kills, rhs.kills).append(damage, rhs.damage).append(activity, rhs.activity).append(survival, rhs.survival).append(accuracy, rhs.accuracy).append(inventory, rhs.inventory).append(interactions, rhs.interactions).append(world, rhs.world).append(advancements, rhs.advancements).append(moderation, rhs.moderation).append(additionalProperties, rhs.additionalProperties).append(movement, rhs.movement).append(deaths, rhs.deaths).isEquals();
    }

}
