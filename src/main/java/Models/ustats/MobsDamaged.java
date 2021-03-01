
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
    "amount",
    "items_used",
    "mobs"
})
public class MobsDamaged implements Serializable
{

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("items_used")
    private String itemsUsed;
    @JsonProperty("mobs")
    private String mobs;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5925548683238409643L;

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public MobsDamaged withAmount(Double amount) {
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

    public MobsDamaged withItemsUsed(String itemsUsed) {
        this.itemsUsed = itemsUsed;
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

    public MobsDamaged withMobs(String mobs) {
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

    public MobsDamaged withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("itemsUsed", itemsUsed).append("mobs", mobs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mobs).append(itemsUsed).append(amount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobsDamaged) == false) {
            return false;
        }
        MobsDamaged rhs = ((MobsDamaged) other);
        return new EqualsBuilder().append(mobs, rhs.mobs).append(itemsUsed, rhs.itemsUsed).append(amount, rhs.amount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
