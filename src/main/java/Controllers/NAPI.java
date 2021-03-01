package Controllers;


import Models.User;
import Models.mcmmo_user;

import java.io.IOException;
import java.util.ArrayList;

/**
 * NeumontMC API controller.
 * Author: William Andrew Penrod
 */
public class NAPI {
    private final JSONBefhelsterung JSONBefhelsterung = new JSONBefhelsterung();

    /**
     * Fetch basic user inforfation (name, UUID)
     *
     * @return
     * @throws IOException
     */
    public ArrayList<User> getUserArrayList() throws IOException {
        return JSONBefhelsterung.parseJSONObjectToUserArrayList(JSONBefhelsterung.getBasicUserDataObj(), "general");
    }

    /**
     * Get an array list of mcmmo_users.
     *
     * @return ArrayList<mcmmo_user> of mcmmo_users'.
     * @throws IOException
     */
    public ArrayList<mcmmo_user> getUserArrayListWithMcmmoStats() throws IOException {
        return JSONBefhelsterung.parseJSONObjectToMcmmo_UserArrayList(JSONBefhelsterung.getMcmmoStatsDataObj(), "mcmmo_users", "mcmmo_skills");
    }

    /**
     * The class below is leftover from a test program, and was left to facilitate further testing in the future barring the need for modification.
     * It is marked as Deprecated and it nor any methods uniquely accessible through it should NEVER be used in a production environment.
     */
    @Deprecated
    public JSONBefhelsterung getJSONBefhelsterung() {
        return new JSONBefhelsterung();
    }
}
