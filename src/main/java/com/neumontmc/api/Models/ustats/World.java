
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
    "Blocks_Broken",
    "Times_Respawned",
    "Blocks_Placed",
    "Ores_Mined",
    "Blocks_Ignited",
    "Seeds_Planted"
})
public class World implements Serializable
{

    @JsonProperty("Blocks_Broken")
    @Valid
    private BlocksBroken blocksBroken;
    @JsonProperty("Times_Respawned")
    @Valid
    private TimesRespawned timesRespawned;
    @JsonProperty("Blocks_Placed")
    @Valid
    private BlocksPlaced blocksPlaced;
    @JsonProperty("Ores_Mined")
    @Valid
    private OresMined oresMined;
    @JsonProperty("Blocks_Ignited")
    @Valid
    private BlocksIgnited blocksIgnited;
    @JsonProperty("Seeds_Planted")
    @Valid
    private SeedsPlanted seedsPlanted;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8858653799578884817L;

    @JsonProperty("Blocks_Broken")
    public BlocksBroken getBlocksBroken() {
        return blocksBroken;
    }

    @JsonProperty("Blocks_Broken")
    public void setBlocksBroken(BlocksBroken blocksBroken) {
        this.blocksBroken = blocksBroken;
    }

    public World withBlocksBroken(BlocksBroken blocksBroken) {
        this.blocksBroken = blocksBroken;
        return this;
    }

    @JsonProperty("Times_Respawned")
    public TimesRespawned getTimesRespawned() {
        return timesRespawned;
    }

    @JsonProperty("Times_Respawned")
    public void setTimesRespawned(TimesRespawned timesRespawned) {
        this.timesRespawned = timesRespawned;
    }

    public World withTimesRespawned(TimesRespawned timesRespawned) {
        this.timesRespawned = timesRespawned;
        return this;
    }

    @JsonProperty("Blocks_Placed")
    public BlocksPlaced getBlocksPlaced() {
        return blocksPlaced;
    }

    @JsonProperty("Blocks_Placed")
    public void setBlocksPlaced(BlocksPlaced blocksPlaced) {
        this.blocksPlaced = blocksPlaced;
    }

    public World withBlocksPlaced(BlocksPlaced blocksPlaced) {
        this.blocksPlaced = blocksPlaced;
        return this;
    }

    @JsonProperty("Ores_Mined")
    public OresMined getOresMined() {
        return oresMined;
    }

    @JsonProperty("Ores_Mined")
    public void setOresMined(OresMined oresMined) {
        this.oresMined = oresMined;
    }

    public World withOresMined(OresMined oresMined) {
        this.oresMined = oresMined;
        return this;
    }

    @JsonProperty("Blocks_Ignited")
    public BlocksIgnited getBlocksIgnited() {
        return blocksIgnited;
    }

    @JsonProperty("Blocks_Ignited")
    public void setBlocksIgnited(BlocksIgnited blocksIgnited) {
        this.blocksIgnited = blocksIgnited;
    }

    public World withBlocksIgnited(BlocksIgnited blocksIgnited) {
        this.blocksIgnited = blocksIgnited;
        return this;
    }

    @JsonProperty("Seeds_Planted")
    public SeedsPlanted getSeedsPlanted() {
        return seedsPlanted;
    }

    @JsonProperty("Seeds_Planted")
    public void setSeedsPlanted(SeedsPlanted seedsPlanted) {
        this.seedsPlanted = seedsPlanted;
    }

    public World withSeedsPlanted(SeedsPlanted seedsPlanted) {
        this.seedsPlanted = seedsPlanted;
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

    public World withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blocksBroken", blocksBroken).append("timesRespawned", timesRespawned).append("blocksPlaced", blocksPlaced).append("oresMined", oresMined).append("blocksIgnited", blocksIgnited).append("seedsPlanted", seedsPlanted).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(blocksIgnited).append(oresMined).append(timesRespawned).append(seedsPlanted).append(blocksPlaced).append(blocksBroken).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof World) == false) {
            return false;
        }
        World rhs = ((World) other);
        return new EqualsBuilder().append(blocksIgnited, rhs.blocksIgnited).append(oresMined, rhs.oresMined).append(timesRespawned, rhs.timesRespawned).append(seedsPlanted, rhs.seedsPlanted).append(blocksPlaced, rhs.blocksPlaced).append(blocksBroken, rhs.blocksBroken).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
