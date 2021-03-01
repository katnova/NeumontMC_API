
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
    "flying",
    "walking",
    "sneaking",
    "sprinting"
})
public class DistanceTravelled implements Serializable
{

    @JsonProperty("flying")
    private Double flying;
    @JsonProperty("walking")
    private Double walking;
    @JsonProperty("sneaking")
    private Double sneaking;
    @JsonProperty("sprinting")
    private Double sprinting;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1985781447603320197L;

    @JsonProperty("flying")
    public Double getFlying() {
        return flying;
    }

    @JsonProperty("flying")
    public void setFlying(Double flying) {
        this.flying = flying;
    }

    public DistanceTravelled withFlying(Double flying) {
        this.flying = flying;
        return this;
    }

    @JsonProperty("walking")
    public Double getWalking() {
        return walking;
    }

    @JsonProperty("walking")
    public void setWalking(Double walking) {
        this.walking = walking;
    }

    public DistanceTravelled withWalking(Double walking) {
        this.walking = walking;
        return this;
    }

    @JsonProperty("sneaking")
    public Double getSneaking() {
        return sneaking;
    }

    @JsonProperty("sneaking")
    public void setSneaking(Double sneaking) {
        this.sneaking = sneaking;
    }

    public DistanceTravelled withSneaking(Double sneaking) {
        this.sneaking = sneaking;
        return this;
    }

    @JsonProperty("sprinting")
    public Double getSprinting() {
        return sprinting;
    }

    @JsonProperty("sprinting")
    public void setSprinting(Double sprinting) {
        this.sprinting = sprinting;
    }

    public DistanceTravelled withSprinting(Double sprinting) {
        this.sprinting = sprinting;
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

    public DistanceTravelled withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flying", flying).append("walking", walking).append("sneaking", sneaking).append("sprinting", sprinting).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sneaking).append(sprinting).append(additionalProperties).append(walking).append(flying).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistanceTravelled) == false) {
            return false;
        }
        DistanceTravelled rhs = ((DistanceTravelled) other);
        return new EqualsBuilder().append(sneaking, rhs.sneaking).append(sprinting, rhs.sprinting).append(additionalProperties, rhs.additionalProperties).append(walking, rhs.walking).append(flying, rhs.flying).isEquals();
    }

}
