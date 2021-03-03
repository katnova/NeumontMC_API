package com.neumontmc.api.Controllers;


import com.neumontmc.api.Models.User;
import com.neumontmc.api.Models.User_mcmmo;
import com.neumontmc.api.Models.ustats.Ustats;
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
     * @return ArrayList<User_mcmmo> of mcmmo_users'.
     * @throws IOException
     */
    public ArrayList<User_mcmmo> getUserArrayListWithMcmmoStats() throws IOException {
        return JSONBefhelsterung.parseJSONObjectToMcmmo_UserArrayList(JSONBefhelsterung.getMcmmoStatsDataObj(), "mcmmo_users", "mcmmo_skills");
    }

    /**
     * Get ArrayList of ORM user stats.
     * @return ArrayList of ORM user stats.
     * @throws IOException If there is an error when processing the ArrayList.
     */
    public ArrayList<Ustats> getORMUserStats() throws IOException {
        return JSONBefhelsterung.parseJSONBlocksMappableObjects(JSONBefhelsterung.mapSerialUserStatsToDataBlocks(JSONBefhelsterung.getUserStatsDataObj()));
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
