
package Models.ustats;

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
    "Items_Picked",
    "Items_Dropped",
    "Items_Crafted",
    "Potions_Made"
})
public class Inventory implements Serializable
{

    @JsonProperty("Items_Picked")
    @Valid
    private ItemsPicked itemsPicked;
    @JsonProperty("Items_Dropped")
    @Valid
    private ItemsDropped itemsDropped;
    @JsonProperty("Items_Crafted")
    @Valid
    private ItemsCrafted itemsCrafted;
    @JsonProperty("Potions_Made")
    @Valid
    private PotionsMade potionsMade;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7397105799698400660L;

    @JsonProperty("Items_Picked")
    public ItemsPicked getItemsPicked() {
        return itemsPicked;
    }

    @JsonProperty("Items_Picked")
    public void setItemsPicked(ItemsPicked itemsPicked) {
        this.itemsPicked = itemsPicked;
    }

    public Inventory withItemsPicked(ItemsPicked itemsPicked) {
        this.itemsPicked = itemsPicked;
        return this;
    }

    @JsonProperty("Items_Dropped")
    public ItemsDropped getItemsDropped() {
        return itemsDropped;
    }

    @JsonProperty("Items_Dropped")
    public void setItemsDropped(ItemsDropped itemsDropped) {
        this.itemsDropped = itemsDropped;
    }

    public Inventory withItemsDropped(ItemsDropped itemsDropped) {
        this.itemsDropped = itemsDropped;
        return this;
    }

    @JsonProperty("Items_Crafted")
    public ItemsCrafted getItemsCrafted() {
        return itemsCrafted;
    }

    @JsonProperty("Items_Crafted")
    public void setItemsCrafted(ItemsCrafted itemsCrafted) {
        this.itemsCrafted = itemsCrafted;
    }

    public Inventory withItemsCrafted(ItemsCrafted itemsCrafted) {
        this.itemsCrafted = itemsCrafted;
        return this;
    }

    @JsonProperty("Potions_Made")
    public PotionsMade getPotionsMade() {
        return potionsMade;
    }

    @JsonProperty("Potions_Made")
    public void setPotionsMade(PotionsMade potionsMade) {
        this.potionsMade = potionsMade;
    }

    public Inventory withPotionsMade(PotionsMade potionsMade) {
        this.potionsMade = potionsMade;
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

    public Inventory withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("itemsPicked", itemsPicked).append("itemsDropped", itemsDropped).append("itemsCrafted", itemsCrafted).append("potionsMade", potionsMade).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(potionsMade).append(itemsDropped).append(itemsPicked).append(additionalProperties).append(itemsCrafted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Inventory) == false) {
            return false;
        }
        Inventory rhs = ((Inventory) other);
        return new EqualsBuilder().append(potionsMade, rhs.potionsMade).append(itemsDropped, rhs.itemsDropped).append(itemsPicked, rhs.itemsPicked).append(additionalProperties, rhs.additionalProperties).append(itemsCrafted, rhs.itemsCrafted).isEquals();
    }

}
