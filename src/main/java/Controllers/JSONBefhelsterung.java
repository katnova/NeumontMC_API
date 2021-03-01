package Controllers;

import Models.User;
import Models.deserializedJsonNodes;
import Models.mcmmo_user;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    /**
     * Take jsonObject, extract array based on key, and parse to an arraylist of User.
     *
     * @param jsonObject a vaild json object containing a key of vaild JSON that can be parsed to ArrayList<User>.
     * @param key        key to look for to build ArrayList<User> off.
     * @return ArrayList<User> of extracted users from jsonObject.
     * * @throws JSONException is JSON is malformed or becomes malformed.
     */
    public ArrayList<User> parseJSONObjectToUserArrayList(JSONObject jsonObject, String key) throws JSONException {
        return parseJSONToUserArray(false, null, jsonObject, key);
    }

    /**
     * Take jsonArray, extract Users based on key, and parse to an arraylist of User.
     *
     * @param jsonArray a vaild json object containing a key of vaild JSON that can be parsed to ArrayList<User>.
     * @param key       key to look for to build ArrayList<User> off.
     * @return ArrayList<User> of extracted users from jsonArray.
     * * @throws JSONException is JSON is malformed or becomes malformed.
     */
    public ArrayList<User> parseJSONArrayToUserArrayList(JSONArray jsonArray, String key) throws JSONException {
        return parseJSONToUserArray(true, jsonArray, null, key);
    }

    /**
     * Take a JSONObject and extract the mcmmo information in keys uKey and sKey.
     *
     * @param jsonObject JSONObject containing keys uKey and sKey.
     * @param uKey       String of key name for mcmmo_users.
     * @param sKey       String of key name for mcmmo_skills.
     * @return ArrayList<mcmmo_user> of mcmmo_users'
     * @throws JSONException if JSON is or becomes malformed.
     */
    public ArrayList<mcmmo_user> parseJSONObjectToMcmmo_UserArrayList(JSONObject jsonObject, String uKey, String sKey) throws JSONException {
        return parseJSONToMcmmo_UserArrayList(false, jsonObject, null, null, uKey, sKey);
    }

    /**
     * Take a JSONObj or Two JSONArrays' and retrive mcmmo stats from them based on uKey and sKey values.
     *
     * @param hasJsonArray True if your going to pass two JSONArrays in, Aus for mcmmo_users, Ein for mcmmo_skills.
     * @param jsonObject   JSONObject containing key values uKey and sKey.
     * @param jsonArrayAus JSONArray for uKey.
     * @param jsonArrayEin JSONArray for sKey.
     * @param uKey         JSON key for jsonArrayofUsers.
     * @param sKey         JSON key for jsonArrayofSkills.
     * @return ArrayList<mcmmo_user> of mcmmo_users'.
     */
    private ArrayList<mcmmo_user> parseJSONToMcmmo_UserArrayList(boolean hasJsonArray, JSONObject jsonObject, JSONArray jsonArrayAus, JSONArray jsonArrayEin, String uKey, String sKey) {
        ArrayList<mcmmo_user> tempList = new ArrayList<mcmmo_user>();
        JSONArray jsonArrayOfUsers;
        JSONArray jsonArrayOfSkills;
        if (!hasJsonArray) {
            jsonArrayOfUsers = getJSONArray(jsonObject, uKey);
            jsonArrayOfSkills = getJSONArray(jsonObject, sKey);
        } else {
            jsonArrayOfUsers = jsonArrayAus;
            jsonArrayOfSkills = jsonArrayEin;
        }
        for (int i = 0; i < jsonArrayOfUsers.length(); i++) {
            JSONObject jau = jsonArrayOfUsers.getJSONObject(i);
            JSONObject jas = jsonArrayOfSkills.getJSONObject(i);
            int tmpId = jau.getInt("id");
            int tmpUid = jas.getInt("user_id");
            if (tmpId == tmpUid) {
                tempList.add(new mcmmo_user(
                        jau.getString("uuid"),
                        jau.getString("user"),
                        null,
                        jau.getInt("id"),
                        0.00,
                        0,
                        jau.getInt("lastlogin"),
                        jas.getInt("taming"),
                        jas.getInt("mining"),
                        jas.getInt("woodcutting"),
                        jas.getInt("repair"),
                        jas.getInt("unarmed"),
                        jas.getInt("herbalism"),
                        jas.getInt("excavation"),
                        jas.getInt("archery"),
                        jas.getInt("swords"),
                        jas.getInt("axes"),
                        jas.getInt("acrobatics"),
                        jas.getInt("fishing"),
                        jas.getInt("alchemy"),
                        jas.getInt("total")
                ));
            }
        }
        return tempList;
    }

    private void parseJSONBlocksToFreeFormUserArray(ArrayList<String> dataBlocks) {
        for(String data : dataBlocks){
            JSONArray tmpJsonArr = new JSONArray(data);
        }
    }

    /**
     * Deserialize /ustats API response to data-blocks appropriate for JSONArray processing.
     *
     * @param jsonObject full ustats response obj
     * @return ArrayList containing JSON strings.
     * @throws JsonProcessingException if an error is encountered processing the JSON.
     */
    private ArrayList<String> mapSerialUserStatsToDataBlocks(JSONObject jsonObject) throws JsonProcessingException {
        ArrayList<String> dataBlocks = new ArrayList();
        ObjectMapper mapper = new ObjectMapper();
        deserializedJsonNodes deserializedNodes = mapper.readValue(jsonObject.toString(), deserializedJsonNodes.class);
        new JSONArray(deserializedNodes.getStats().toString()).iterator().forEachRemaining(element -> {
            dataBlocks.add(element.toString());
        });
        return dataBlocks;
    }

    /**
     * Parse users in JSON arr or obj to UserArray.
     *
     * @param hasJsonArray Set to true if you are passing in a JSONArray, false if you are passing in a JSONObject.
     * @param jsonArr      Vaild JSONArray containing a key matching String key.
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
                    0,
                    jsonArray.getJSONObject(i).getDouble("Balance"),
                    jsonArray.getJSONObject(i).getInt("TotalPlayTime")
            ));
        }
        return returnArray;
    }

    /**
     * Get a JSON obj from a HTTP response obj.
     *
     * @param res A HttpResponse<String> obj containing a JSON body.
     * @return JSONObject containing the JSON body from res.
     * @throws IllegalStateException if JSON obj is null.
     * @catch JSONException if res does not contain a JSON body or is malformed.
     */
    private JSONObject getJSONObject(HttpResponse<String> res) {
        try {
            JSONObject jsonObject = new JSONObject(res.getBody());
            if (jsonObject != null)
                return jsonObject;
            throw new IllegalStateException("Null JSON obj.");
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
