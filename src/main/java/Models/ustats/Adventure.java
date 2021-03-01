
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
    "advancements"
})
public class Adventure implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("advancements")
    private String advancements;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5904305446013831013L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Adventure withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("advancements")
    public String getAdvancements() {
        return advancements;
    }

    @JsonProperty("advancements")
    public void setAdvancements(String advancements) {
        this.advancements = advancements;
    }

    public Adventure withAdvancements(String advancements) {
        this.advancements = advancements;
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

    public Adventure withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("advancements", advancements).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(advancements).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Adventure) == false) {
            return false;
        }
        Adventure rhs = ((Adventure) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(advancements, rhs.advancements).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
