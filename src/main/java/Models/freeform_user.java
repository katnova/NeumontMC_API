package Models;

import com.fasterxml.jackson.databind.JsonNode;

public class freeform_user extends mcmmo_user{
    private String freeform_JSON;
    public freeform_user(String uuid, String username, String nickname, int mcmmo_forignKey, double Balance, int TotalPlayTime, int lastlogin, int taming, int mining, int woodcutting, int repair, int unarmed, int herbalism, int excavation, int archery, int swords, int axes, int acrobatics, int fishing, int alchemy, int total, String freeform_JSON) {
        super(uuid, username, nickname, mcmmo_forignKey, Balance, TotalPlayTime, lastlogin, taming, mining, woodcutting, repair, unarmed, herbalism, excavation, archery, swords, axes, acrobatics, fishing, alchemy, total);
        this.freeform_JSON = freeform_JSON;
    }
}
