
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
    "Times_Joined",
    "Commands_Executed",
    "Times_Kicked",
    "Chat_Messages_Sent",
    "Times_Left"
})
public class Activity implements Serializable
{

    @JsonProperty("Times_Joined")
    @Valid
    private TimesJoined timesJoined;
    @JsonProperty("Commands_Executed")
    @Valid
    private CommandsExecuted commandsExecuted;
    @JsonProperty("Times_Kicked")
    @Valid
    private TimesKicked timesKicked;
    @JsonProperty("Chat_Messages_Sent")
    @Valid
    private ChatMessagesSent chatMessagesSent;
    @JsonProperty("Times_Left")
    @Valid
    private TimesLeft timesLeft;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2770064454947662258L;

    @JsonProperty("Times_Joined")
    public TimesJoined getTimesJoined() {
        return timesJoined;
    }

    @JsonProperty("Times_Joined")
    public void setTimesJoined(TimesJoined timesJoined) {
        this.timesJoined = timesJoined;
    }

    public Activity withTimesJoined(TimesJoined timesJoined) {
        this.timesJoined = timesJoined;
        return this;
    }

    @JsonProperty("Commands_Executed")
    public CommandsExecuted getCommandsExecuted() {
        return commandsExecuted;
    }

    @JsonProperty("Commands_Executed")
    public void setCommandsExecuted(CommandsExecuted commandsExecuted) {
        this.commandsExecuted = commandsExecuted;
    }

    public Activity withCommandsExecuted(CommandsExecuted commandsExecuted) {
        this.commandsExecuted = commandsExecuted;
        return this;
    }

    @JsonProperty("Times_Kicked")
    public TimesKicked getTimesKicked() {
        return timesKicked;
    }

    @JsonProperty("Times_Kicked")
    public void setTimesKicked(TimesKicked timesKicked) {
        this.timesKicked = timesKicked;
    }

    public Activity withTimesKicked(TimesKicked timesKicked) {
        this.timesKicked = timesKicked;
        return this;
    }

    @JsonProperty("Chat_Messages_Sent")
    public ChatMessagesSent getChatMessagesSent() {
        return chatMessagesSent;
    }

    @JsonProperty("Chat_Messages_Sent")
    public void setChatMessagesSent(ChatMessagesSent chatMessagesSent) {
        this.chatMessagesSent = chatMessagesSent;
    }

    public Activity withChatMessagesSent(ChatMessagesSent chatMessagesSent) {
        this.chatMessagesSent = chatMessagesSent;
        return this;
    }

    @JsonProperty("Times_Left")
    public TimesLeft getTimesLeft() {
        return timesLeft;
    }

    @JsonProperty("Times_Left")
    public void setTimesLeft(TimesLeft timesLeft) {
        this.timesLeft = timesLeft;
    }

    public Activity withTimesLeft(TimesLeft timesLeft) {
        this.timesLeft = timesLeft;
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

    public Activity withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timesJoined", timesJoined).append("commandsExecuted", commandsExecuted).append("timesKicked", timesKicked).append("chatMessagesSent", chatMessagesSent).append("timesLeft", timesLeft).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(commandsExecuted).append(timesKicked).append(timesJoined).append(timesLeft).append(additionalProperties).append(chatMessagesSent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Activity) == false) {
            return false;
        }
        Activity rhs = ((Activity) other);
        return new EqualsBuilder().append(commandsExecuted, rhs.commandsExecuted).append(timesKicked, rhs.timesKicked).append(timesJoined, rhs.timesJoined).append(timesLeft, rhs.timesLeft).append(additionalProperties, rhs.additionalProperties).append(chatMessagesSent, rhs.chatMessagesSent).isEquals();
    }

}
