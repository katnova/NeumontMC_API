package Models;


import Controllers.Zeitsterung;

public class User {
    private final Zeitsterung Zeitsterung = new Zeitsterung();
    private UUID uuid;
    private String username;
    private String nickname;
    private double Balance;
    private int TotalPlayTime;
    private int mcmmo_forignKey;

    public User(String uuid, String username, String nickname, int mcmmo_forignKey, double Balance, int TotalPlayTime) {
        this.uuid = new UUID(uuid);
        this.username = username;
        this.nickname = nickname;
        this.mcmmo_forignKey = mcmmo_forignKey;
        this.Balance = Balance;
        this.TotalPlayTime = TotalPlayTime;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getTotalPlayTime() {
        return TotalPlayTime;
    }

    public void setTotalPlayTime(int totalPlayTime) {
        TotalPlayTime = totalPlayTime;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getMcmmo_forignKey() {
        return mcmmo_forignKey;
    }

    public void setMcmmo_forignKey(int mcmmo_forignKey) {
        this.mcmmo_forignKey = mcmmo_forignKey;
    }

    @Override
    public String toString() {
        return "User Information:" +
                "\n UUID (long)               : " + uuid.getUUID() +
                "\n Username                  : " + username +
                "\n Nickname                  : " + nickname +
                "\n Total Play Time (D:H:M:S) : " + Zeitsterung.convertMillisToStdDHMSFormat(TotalPlayTime) +
                "\n Balance ($)               : " + Balance +
                "\n mcmmo_forignKey           : " + mcmmo_forignKey;
    }

}
