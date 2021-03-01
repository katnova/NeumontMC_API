
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
    "buttons"
})
public class ButtonsInteracted implements Serializable
{

    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("buttons")
    private String buttons;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4561280022471531652L;

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public ButtonsInteracted withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("buttons")
    public String getButtons() {
        return buttons;
    }

    @JsonProperty("buttons")
    public void setButtons(String buttons) {
        this.buttons = buttons;
    }

    public ButtonsInteracted withButtons(String buttons) {
        this.buttons = buttons;
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

    public ButtonsInteracted withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("buttons", buttons).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(buttons).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ButtonsInteracted) == false) {
            return false;
        }
        ButtonsInteracted rhs = ((ButtonsInteracted) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(buttons, rhs.buttons).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
