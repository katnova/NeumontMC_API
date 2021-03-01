
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
    "Players_Teleported",
    "Players_Spectated"
})
public class Moderation implements Serializable
{

    @JsonProperty("Players_Teleported")
    @Valid
    private PlayersTeleported playersTeleported;
    @JsonProperty("Players_Spectated")
    @Valid
    private PlayersSpectated playersSpectated;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 477255669555275536L;

    @JsonProperty("Players_Teleported")
    public PlayersTeleported getPlayersTeleported() {
        return playersTeleported;
    }

    @JsonProperty("Players_Teleported")
    public void setPlayersTeleported(PlayersTeleported playersTeleported) {
        this.playersTeleported = playersTeleported;
    }

    public Moderation withPlayersTeleported(PlayersTeleported playersTeleported) {
        this.playersTeleported = playersTeleported;
        return this;
    }

    @JsonProperty("Players_Spectated")
    public PlayersSpectated getPlayersSpectated() {
        return playersSpectated;
    }

    @JsonProperty("Players_Spectated")
    public void setPlayersSpectated(PlayersSpectated playersSpectated) {
        this.playersSpectated = playersSpectated;
    }

    public Moderation withPlayersSpectated(PlayersSpectated playersSpectated) {
        this.playersSpectated = playersSpectated;
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

    public Moderation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("playersTeleported", playersTeleported).append("playersSpectated", playersSpectated).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(playersTeleported).append(playersSpectated).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Moderation) == false) {
            return false;
        }
        Moderation rhs = ((Moderation) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(playersTeleported, rhs.playersTeleported).append(playersSpectated, rhs.playersSpectated).isEquals();
    }

}
