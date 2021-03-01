
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
    "armors"
})
public class ArmorsWorn implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("armors")
    private String armors;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -338184949419953986L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public ArmorsWorn withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("armors")
    public String getArmors() {
        return armors;
    }

    @JsonProperty("armors")
    public void setArmors(String armors) {
        this.armors = armors;
    }

    public ArmorsWorn withArmors(String armors) {
        this.armors = armors;
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

    public ArmorsWorn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("armors", armors).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(armors).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArmorsWorn) == false) {
            return false;
        }
        ArmorsWorn rhs = ((ArmorsWorn) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(armors, rhs.armors).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
