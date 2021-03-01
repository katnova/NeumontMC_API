
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
    "last_reason",
    "last_date"
})
public class TimesKicked implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("last_reason")
    private String lastReason;
    @JsonProperty("last_date")
    private String lastDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4796029452168579024L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public TimesKicked withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("last_reason")
    public String getLastReason() {
        return lastReason;
    }

    @JsonProperty("last_reason")
    public void setLastReason(String lastReason) {
        this.lastReason = lastReason;
    }

    public TimesKicked withLastReason(String lastReason) {
        this.lastReason = lastReason;
        return this;
    }

    @JsonProperty("last_date")
    public String getLastDate() {
        return lastDate;
    }

    @JsonProperty("last_date")
    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public TimesKicked withLastDate(String lastDate) {
        this.lastDate = lastDate;
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

    public TimesKicked withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("lastReason", lastReason).append("lastDate", lastDate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(additionalProperties).append(lastReason).append(lastDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimesKicked) == false) {
            return false;
        }
        TimesKicked rhs = ((TimesKicked) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(additionalProperties, rhs.additionalProperties).append(lastReason, rhs.lastReason).append(lastDate, rhs.lastDate).isEquals();
    }

}
