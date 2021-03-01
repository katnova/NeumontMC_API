package Controllers;

import Models.User;
import kong.unirest.HttpResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class JSONBefhelsterung {
    private final APIBefhelsterung apiBefhelsterung = new APIBefhelsterung();

    /**
     * Get a JSON obj containing data from APIBefhelsterung.
     *
     * @return JSONObject containing basic information for each user on neumontmc.com
     * @throws IOException if apiBefhelsterung fails to retrive the requested data.
     */
    protected JSONObject getBasicUserDataObj() throws IOException {
        return getJSONObject(apiBefhelsterung.getUsers());
    }

    /**
     * Get a JSON obj containing data from APIBefhelsterung.
     *
     * @return JSONObject containing detailed stats for each user on neumontmc.com
     * @throws IOException if apiBefhelsterung fails to retrive the requested data.
     */
    protected JSONObject getUserStatsDataObj() throws IOException {
        return getJSONObject(apiBefhelsterung.getUserStats());
    }

    /**
     * Get a JSON obj containing data from APIBefhelsterung.
     *
     * @return JSONObject containing detailed mcmmo stats for each user on neumontmc.com
     * @throws IOException if apiBefhelsterung fails to retrive the requested data.
     */
    protected JSONObject getMcmmoStatsDataObj() throws IOException {
        return getJSONObject(apiBefhelsterung.getMcmmoStats());
    }

    /**
     * Get a JSON array steming from a target key.
     *
     * @param jsonObject JSON to parse for key.
     * @param key        Key to parse for.
     * @return JSONArray stemming from key.
     * @throws JSONException if there is an error parsing the JSONObject for target key.
     */
    public JSONArray getJSONArray(JSONObject jsonObject, String key) throws JSONException {
        return jsonObject.getJSONArray(key);
    }

    public ArrayList<User> parseJSONObjectToUserArrayList(JSONObject jsonObject, String key) throws JSONException {
        return parseJSONToUserArray(false, null, jsonObject, key);
    }

    public ArrayList<User> parseJSONArrayToUserArrayList(JSONArray jsonArray, String key) throws JSONException {
        return parseJSONToUserArray(true, jsonArray, null, key);
    }

    /**
     * Parse users in JSON arr or obj to UserArray.
     *
     * @param hasJsonArray Set to true if you are passing in a JSONArray, false if you are passing in a JSONObject.
     * @param jsonArray    Vaild JSONArray containing a key matching String key.
     * @param jsonObject   Vaild JSONObject containing a key matching String key.
     * @param key          A vaild key contained in jsonObject or jsonArray.
     * @return ArrayList<User> Array of User objects.
     */
    private ArrayList<User> parseJSONToUserArray(boolean hasJsonArray, JSONArray jsonArr, JSONObject jsonObject, String key) {
        ArrayList<User> returnArray = new ArrayList<User>();
        JSONArray jsonArray;
        if (!hasJsonArray)
            jsonArray = getJSONArray(jsonObject, key);
        else
            jsonArray = jsonArr;
        for (int i = 0; i < jsonArray.length(); i++) {
            returnArray.add(new User(
                    jsonArray.getJSONObject(i).getString("player_uuid"),
                    jsonArray.getJSONObject(i).getString("username"),
                    null,
                    0
            ));
        }
        return returnArray;
    }

    /**
     * Get a JSON obj from a HTTP response obj.
     *
     * @param res A HttpResponse<String> obj containing a JSON body.
     * @return JSONObject containing the JSON body from res.
     * @catch JSONException if res does not contain a JSON body or is malformed.
     */
    private JSONObject getJSONObject(HttpResponse<String> res) {
        try {
            JSONObject jsonObject = new JSONObject(res.getBody());
            return jsonObject;
        } catch (JSONException er) {
            er.printStackTrace();
            throw new IllegalStateException("Could not parse JSON.");
        }
    }

    @Deprecated
    public APIBefhelsterung getApiBefhelsterung() {
        return apiBefhelsterung;
    }
}
