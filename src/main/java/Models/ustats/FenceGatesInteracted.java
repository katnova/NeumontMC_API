
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
    "fence_gates"
})
public class FenceGatesInteracted implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("fence_gates")
    private String fenceGates;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1915460757532371336L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public FenceGatesInteracted withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("fence_gates")
    public String getFenceGates() {
        return fenceGates;
    }

    @JsonProperty("fence_gates")
    public void setFenceGates(String fenceGates) {
        this.fenceGates = fenceGates;
    }

    public FenceGatesInteracted withFenceGates(String fenceGates) {
        this.fenceGates = fenceGates;
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

    public FenceGatesInteracted withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("fenceGates", fenceGates).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(fenceGates).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FenceGatesInteracted) == false) {
            return false;
        }
        FenceGatesInteracted rhs = ((FenceGatesInteracted) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(fenceGates, rhs.fenceGates).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
