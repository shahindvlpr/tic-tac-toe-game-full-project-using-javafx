
package server.models;

import org.json.JSONObject;


public class Helpers {

    public static String getStatusObject(String status) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", status);
        return jsonObject.toString();
    }



}
