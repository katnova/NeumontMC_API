package Controllers;


import Models.User;

import java.io.IOException;
import java.util.ArrayList;

/**
 * NeumontMC API controller.
 * Author: William Andrew Penrod
 */
public class NAPI {
    private final JSONBefhelsterung JSONBefhelsterung = new JSONBefhelsterung();

    public ArrayList<User> getUserArrayList() throws IOException {
        return JSONBefhelsterung.parseJSONObjectToUserArrayList(JSONBefhelsterung.getBasicUserDataObj(), "general");
    }

    /**
    * The class below is leftover from a test program, and was left to facilitate further testing in the future barring the need for modification.
    * It is marked as Deprecated and it nor any methods uniquely accessible through it should NEVER be used in a production environment.
    * */
    @Deprecated
    public JSONBefhelsterung getJSONBefhelsterung() {
        return new JSONBefhelsterung();
    }
}
