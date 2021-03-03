
package com.neumontmc.api.Models.ustats;

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
    "Buttons_Interacted",
    "Doors_Interacted",
    "Levers_Interacted",
    "Trapdoors_Interacted",
    "Dispensers_Interacted",
    "Droppers_Interacted",
    "Craft_Tables_Interacted",
    "Chests_Interacted",
    "Fence_Gates_Interacted",
    "Hoppers_Interacted",
    "Furnaces_Interacted"
})
public class Interactions implements Serializable
{

    @JsonProperty("Buttons_Interacted")
    @Valid
    private ButtonsInteracted buttonsInteracted;
    @JsonProperty("Doors_Interacted")
    @Valid
    private DoorsInteracted doorsInteracted;
    @JsonProperty("Levers_Interacted")
    @Valid
    private LeversInteracted leversInteracted;
    @JsonProperty("Trapdoors_Interacted")
    @Valid
    private TrapdoorsInteracted trapdoorsInteracted;
    @JsonProperty("Dispensers_Interacted")
    @Valid
    private DispensersInteracted dispensersInteracted;
    @JsonProperty("Droppers_Interacted")
    @Valid
    private DroppersInteracted droppersInteracted;
    @JsonProperty("Craft_Tables_Interacted")
    @Valid
    private CraftTablesInteracted craftTablesInteracted;
    @JsonProperty("Chests_Interacted")
    @Valid
    private ChestsInteracted chestsInteracted;
    @JsonProperty("Fence_Gates_Interacted")
    @Valid
    private FenceGatesInteracted fenceGatesInteracted;
    @JsonProperty("Hoppers_Interacted")
    @Valid
    private HoppersInteracted hoppersInteracted;
    @JsonProperty("Furnaces_Interacted")
    @Valid
    private FurnacesInteracted furnacesInteracted;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6806575344837346936L;

    @JsonProperty("Buttons_Interacted")
    public ButtonsInteracted getButtonsInteracted() {
        return buttonsInteracted;
    }

    @JsonProperty("Buttons_Interacted")
    public void setButtonsInteracted(ButtonsInteracted buttonsInteracted) {
        this.buttonsInteracted = buttonsInteracted;
    }

    public Interactions withButtonsInteracted(ButtonsInteracted buttonsInteracted) {
        this.buttonsInteracted = buttonsInteracted;
        return this;
    }

    @JsonProperty("Doors_Interacted")
    public DoorsInteracted getDoorsInteracted() {
        return doorsInteracted;
    }

    @JsonProperty("Doors_Interacted")
    public void setDoorsInteracted(DoorsInteracted doorsInteracted) {
        this.doorsInteracted = doorsInteracted;
    }

    public Interactions withDoorsInteracted(DoorsInteracted doorsInteracted) {
        this.doorsInteracted = doorsInteracted;
        return this;
    }

    @JsonProperty("Levers_Interacted")
    public LeversInteracted getLeversInteracted() {
        return leversInteracted;
    }

    @JsonProperty("Levers_Interacted")
    public void setLeversInteracted(LeversInteracted leversInteracted) {
        this.leversInteracted = leversInteracted;
    }

    public Interactions withLeversInteracted(LeversInteracted leversInteracted) {
        this.leversInteracted = leversInteracted;
        return this;
    }

    @JsonProperty("Trapdoors_Interacted")
    public TrapdoorsInteracted getTrapdoorsInteracted() {
        return trapdoorsInteracted;
    }

    @JsonProperty("Trapdoors_Interacted")
    public void setTrapdoorsInteracted(TrapdoorsInteracted trapdoorsInteracted) {
        this.trapdoorsInteracted = trapdoorsInteracted;
    }

    public Interactions withTrapdoorsInteracted(TrapdoorsInteracted trapdoorsInteracted) {
        this.trapdoorsInteracted = trapdoorsInteracted;
        return this;
    }

    @JsonProperty("Dispensers_Interacted")
    public DispensersInteracted getDispensersInteracted() {
        return dispensersInteracted;
    }

    @JsonProperty("Dispensers_Interacted")
    public void setDispensersInteracted(DispensersInteracted dispensersInteracted) {
        this.dispensersInteracted = dispensersInteracted;
    }

    public Interactions withDispensersInteracted(DispensersInteracted dispensersInteracted) {
        this.dispensersInteracted = dispensersInteracted;
        return this;
    }

    @JsonProperty("Droppers_Interacted")
    public DroppersInteracted getDroppersInteracted() {
        return droppersInteracted;
    }

    @JsonProperty("Droppers_Interacted")
    public void setDroppersInteracted(DroppersInteracted droppersInteracted) {
        this.droppersInteracted = droppersInteracted;
    }

    public Interactions withDroppersInteracted(DroppersInteracted droppersInteracted) {
        this.droppersInteracted = droppersInteracted;
        return this;
    }

    @JsonProperty("Craft_Tables_Interacted")
    public CraftTablesInteracted getCraftTablesInteracted() {
        return craftTablesInteracted;
    }

    @JsonProperty("Craft_Tables_Interacted")
    public void setCraftTablesInteracted(CraftTablesInteracted craftTablesInteracted) {
        this.craftTablesInteracted = craftTablesInteracted;
    }

    public Interactions withCraftTablesInteracted(CraftTablesInteracted craftTablesInteracted) {
        this.craftTablesInteracted = craftTablesInteracted;
        return this;
    }

    @JsonProperty("Chests_Interacted")
    public ChestsInteracted getChestsInteracted() {
        return chestsInteracted;
    }

    @JsonProperty("Chests_Interacted")
    public void setChestsInteracted(ChestsInteracted chestsInteracted) {
        this.chestsInteracted = chestsInteracted;
    }

    public Interactions withChestsInteracted(ChestsInteracted chestsInteracted) {
        this.chestsInteracted = chestsInteracted;
        return this;
    }

    @JsonProperty("Fence_Gates_Interacted")
    public FenceGatesInteracted getFenceGatesInteracted() {
        return fenceGatesInteracted;
    }

    @JsonProperty("Fence_Gates_Interacted")
    public void setFenceGatesInteracted(FenceGatesInteracted fenceGatesInteracted) {
        this.fenceGatesInteracted = fenceGatesInteracted;
    }

    public Interactions withFenceGatesInteracted(FenceGatesInteracted fenceGatesInteracted) {
        this.fenceGatesInteracted = fenceGatesInteracted;
        return this;
    }

    @JsonProperty("Hoppers_Interacted")
    public HoppersInteracted getHoppersInteracted() {
        return hoppersInteracted;
    }

    @JsonProperty("Hoppers_Interacted")
    public void setHoppersInteracted(HoppersInteracted hoppersInteracted) {
        this.hoppersInteracted = hoppersInteracted;
    }

    public Interactions withHoppersInteracted(HoppersInteracted hoppersInteracted) {
        this.hoppersInteracted = hoppersInteracted;
        return this;
    }

    @JsonProperty("Furnaces_Interacted")
    public FurnacesInteracted getFurnacesInteracted() {
        return furnacesInteracted;
    }

    @JsonProperty("Furnaces_Interacted")
    public void setFurnacesInteracted(FurnacesInteracted furnacesInteracted) {
        this.furnacesInteracted = furnacesInteracted;
    }

    public Interactions withFurnacesInteracted(FurnacesInteracted furnacesInteracted) {
        this.furnacesInteracted = furnacesInteracted;
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

    public Interactions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("buttonsInteracted", buttonsInteracted).append("doorsInteracted", doorsInteracted).append("leversInteracted", leversInteracted).append("trapdoorsInteracted", trapdoorsInteracted).append("dispensersInteracted", dispensersInteracted).append("droppersInteracted", droppersInteracted).append("craftTablesInteracted", craftTablesInteracted).append("chestsInteracted", chestsInteracted).append("fenceGatesInteracted", fenceGatesInteracted).append("hoppersInteracted", hoppersInteracted).append("furnacesInteracted", furnacesInteracted).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hoppersInteracted).append(dispensersInteracted).append(trapdoorsInteracted).append(droppersInteracted).append(chestsInteracted).append(buttonsInteracted).append(doorsInteracted).append(fenceGatesInteracted).append(furnacesInteracted).append(additionalProperties).append(leversInteracted).append(craftTablesInteracted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interactions) == false) {
            return false;
        }
        Interactions rhs = ((Interactions) other);
        return new EqualsBuilder().append(hoppersInteracted, rhs.hoppersInteracted).append(dispensersInteracted, rhs.dispensersInteracted).append(trapdoorsInteracted, rhs.trapdoorsInteracted).append(droppersInteracted, rhs.droppersInteracted).append(chestsInteracted, rhs.chestsInteracted).append(buttonsInteracted, rhs.buttonsInteracted).append(doorsInteracted, rhs.doorsInteracted).append(fenceGatesInteracted, rhs.fenceGatesInteracted).append(furnacesInteracted, rhs.furnacesInteracted).append(additionalProperties, rhs.additionalProperties).append(leversInteracted, rhs.leversInteracted).append(craftTablesInteracted, rhs.craftTablesInteracted).isEquals();
    }

}
