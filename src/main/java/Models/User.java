package Models;


public class User {
    private UUID uuid;
    private String username;
    private String nickname;
    private int mcmmo_forignKey;

    public User(String uuid, String username, String nickname, int mcmmo_forignKey) {
        this.uuid = new UUID(uuid);
        this.username = username;
        this.nickname = nickname;
        this.mcmmo_forignKey = mcmmo_forignKey;
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
                "\n UUID            : " + uuid.getUUID() +
                "\n Username        : " + username +
                "\n Nickname        : " + nickname +
                "\n mcmmo_forignKey : " + mcmmo_forignKey;
    }
}
