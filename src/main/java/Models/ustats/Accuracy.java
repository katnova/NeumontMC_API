
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
    "Hits_Missed",
    "Hits_Dealt",
    "Percentage"
})
public class Accuracy implements Serializable
{

    @JsonProperty("Hits_Missed")
    @Valid
    private HitsMissed hitsMissed;
    @JsonProperty("Hits_Dealt")
    @Valid
    private HitsDealt hitsDealt;
    @JsonProperty("Percentage")
    @Valid
    private Percentage percentage;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3638822706950502185L;

    @JsonProperty("Hits_Missed")
    public HitsMissed getHitsMissed() {
        return hitsMissed;
    }

    @JsonProperty("Hits_Missed")
    public void setHitsMissed(HitsMissed hitsMissed) {
        this.hitsMissed = hitsMissed;
    }

    public Accuracy withHitsMissed(HitsMissed hitsMissed) {
        this.hitsMissed = hitsMissed;
        return this;
    }

    @JsonProperty("Hits_Dealt")
    public HitsDealt getHitsDealt() {
        return hitsDealt;
    }

    @JsonProperty("Hits_Dealt")
    public void setHitsDealt(HitsDealt hitsDealt) {
        this.hitsDealt = hitsDealt;
    }

    public Accuracy withHitsDealt(HitsDealt hitsDealt) {
        this.hitsDealt = hitsDealt;
        return this;
    }

    @JsonProperty("Percentage")
    public Percentage getPercentage() {
        return percentage;
    }

    @JsonProperty("Percentage")
    public void setPercentage(Percentage percentage) {
        this.percentage = percentage;
    }

    public Accuracy withPercentage(Percentage percentage) {
        this.percentage = percentage;
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

    public Accuracy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hitsMissed", hitsMissed).append("hitsDealt", hitsDealt).append("percentage", percentage).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(hitsMissed).append(hitsDealt).append(percentage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Accuracy) == false) {
            return false;
        }
        Accuracy rhs = ((Accuracy) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(hitsMissed, rhs.hitsMissed).append(hitsDealt, rhs.hitsDealt).append(percentage, rhs.percentage).isEquals();
    }

}
