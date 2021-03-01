
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
    "arguments"
})
public class CommandsExecuted implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("arguments")
    private Long arguments;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5179369735745943974L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public CommandsExecuted withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("arguments")
    public Long getArguments() {
        return arguments;
    }

    @JsonProperty("arguments")
    public void setArguments(Long arguments) {
        this.arguments = arguments;
    }

    public CommandsExecuted withArguments(Long arguments) {
        this.arguments = arguments;
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

    public CommandsExecuted withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("arguments", arguments).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(arguments).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommandsExecuted) == false) {
            return false;
        }
        CommandsExecuted rhs = ((CommandsExecuted) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(arguments, rhs.arguments).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
