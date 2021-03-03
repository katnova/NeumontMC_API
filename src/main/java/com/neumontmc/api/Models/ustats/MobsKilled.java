
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
    "mobs"
})
public class MobsKilled implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("kill_streak")
    private Long killStreak;
    @JsonProperty("mobs")
    private String mobs;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 71535431324376899L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public MobsKilled withAmount(Long amount) {
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

    public MobsKilled withKillStreak(Long killStreak) {
        this.killStreak = killStreak;
        return this;
    }

    @JsonProperty("mobs")
    public String getMobs() {
        return mobs;
    }

    @JsonProperty("mobs")
    public void setMobs(String mobs) {
        this.mobs = mobs;
    }

    public MobsKilled withMobs(String mobs) {
        this.mobs = mobs;
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

    public MobsKilled withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("killStreak", killStreak).append("mobs", mobs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mobs).append(killStreak).append(amount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobsKilled) == false) {
            return false;
        }
        MobsKilled rhs = ((MobsKilled) other);
        return new EqualsBuilder().append(mobs, rhs.mobs).append(killStreak, rhs.killStreak).append(amount, rhs.amount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
