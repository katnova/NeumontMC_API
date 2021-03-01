
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
    "ores",
    "pickaxes_used"
})
public class OresMined implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("ores")
    private String ores;
    @JsonProperty("pickaxes_used")
    private String pickaxesUsed;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6685295126716929673L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public OresMined withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("ores")
    public String getOres() {
        return ores;
    }

    @JsonProperty("ores")
    public void setOres(String ores) {
        this.ores = ores;
    }

    public OresMined withOres(String ores) {
        this.ores = ores;
        return this;
    }

    @JsonProperty("pickaxes_used")
    public String getPickaxesUsed() {
        return pickaxesUsed;
    }

    @JsonProperty("pickaxes_used")
    public void setPickaxesUsed(String pickaxesUsed) {
        this.pickaxesUsed = pickaxesUsed;
    }

    public OresMined withPickaxesUsed(String pickaxesUsed) {
        this.pickaxesUsed = pickaxesUsed;
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

    public OresMined withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("ores", ores).append("pickaxesUsed", pickaxesUsed).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pickaxesUsed).append(amount).append(additionalProperties).append(ores).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OresMined) == false) {
            return false;
        }
        OresMined rhs = ((OresMined) other);
        return new EqualsBuilder().append(pickaxesUsed, rhs.pickaxesUsed).append(amount, rhs.amount).append(additionalProperties, rhs.additionalProperties).append(ores, rhs.ores).isEquals();
    }

}
