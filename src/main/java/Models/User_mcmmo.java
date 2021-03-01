package Models;

public class User_mcmmo extends User{
    private int lastlogin;
    private int taming;
    private int mining;
    private int woodcutting;
    private int repair;
    private int unarmed;
    private int herbalism;
    private int excavation;
    private int archery;
    private int swords;
    private int axes;
    private int acrobatics;
    private int fishing;
    private int alchemy;
    private int total;

    public User_mcmmo(String uuid, String username, String nickname, int mcmmo_forignKey, double Balance, int TotalPlayTime, int lastlogin, int taming, int mining, int woodcutting, int repair, int unarmed, int herbalism, int excavation, int archery, int swords, int axes, int acrobatics, int fishing, int alchemy, int total) {
        super(uuid, username, nickname, mcmmo_forignKey, Balance, TotalPlayTime);
        this.lastlogin = lastlogin;
        this.taming = taming;
        this.mining = mining;
        this.woodcutting = woodcutting;
        this.repair = repair;
        this.unarmed = unarmed;
        this.herbalism = herbalism;
        this.excavation = excavation;
        this.archery = archery;
        this.swords = swords;
        this.axes = axes;
        this.acrobatics = acrobatics;
        this.fishing = fishing;
        this.alchemy = alchemy;
        this.total = total;
    }

    public long getLastlogin() {
        return lastlogin;
    }

    public int getTaming() {
        return taming;
    }

    public int getMining() {
        return mining;
    }

    public int getWoodcutting() {
        return woodcutting;
    }

    public int getRepair() {
        return repair;
    }

    public int getUnarmed() {
        return unarmed;
    }

    public int getHerbalism() {
        return herbalism;
    }

    public int getExcavation() {
        return excavation;
    }

    public int getArchery() {
        return archery;
    }

    public int getSwords() {
        return swords;
    }

    public int getAxes() {
        return axes;
    }

    public int getAcrobatics() {
        return acrobatics;
    }

    public int getFishing() {
        return fishing;
    }

    public int getAlchemy() {
        return alchemy;
    }

    public int getTotal() {
        return total;
    }

    public void setLastlogin(int lastlogin) {
        this.lastlogin = lastlogin;
    }

    public void setTaming(int taming) {
        this.taming = taming;
    }

    public void setMining(int mining) {
        this.mining = mining;
    }

    public void setWoodcutting(int woodcutting) {
        this.woodcutting = woodcutting;
    }

    public void setRepair(int repair) {
        this.repair = repair;
    }

    public void setUnarmed(int unarmed) {
        this.unarmed = unarmed;
    }

    public void setHerbalism(int herbalism) {
        this.herbalism = herbalism;
    }

    public void setExcavation(int excavation) {
        this.excavation = excavation;
    }

    public void setArchery(int archery) {
        this.archery = archery;
    }

    public void setSwords(int swords) {
        this.swords = swords;
    }

    public void setAxes(int axes) {
        this.axes = axes;
    }

    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    public void setFishing(int fishing) {
        this.fishing = fishing;
    }

    public void setAlchemy(int alchemy) {
        this.alchemy = alchemy;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "\n---User_mcmmo----------------------------------- " +
                "\n" + super.toString() +
                "\n lastlogin                 : " + lastlogin +
                "\n-MCMMO SKILL LEVELS:" +
                "\n  taming                   : " + taming +
                "\n  mining                   : " + mining +
                "\n  woodcutting              : " + woodcutting +
                "\n  repair                   : " + repair +
                "\n  unarmed                  : " + unarmed +
                "\n  herbalism                : " + herbalism +
                "\n  excavation               : " + excavation +
                "\n  archery                  : " + archery +
                "\n  swords                   : " + swords +
                "\n  axes                     : " + axes +
                "\n  acrobatics               : " + acrobatics +
                "\n  fishing                  : " + fishing +
                "\n  alchemy                  : " + alchemy +
                "\n total skill level         : " + total;
    }
}
