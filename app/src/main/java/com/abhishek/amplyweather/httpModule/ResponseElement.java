package com.abhishek.amplyweather.httpModule;

import org.json.JSONArray;

public class ResponseElement {
    ResponseBuilder responseBuilder;

    public ResponseElement(String response) {
        responseBuilder = new ResponseBuilder(response);
    }

    public int getStatusCode() {
        String code = responseBuilder.getString("status");

        if (code.equals(""))
            code = "500";
        return Integer.parseInt(code);
    }

    public String getData(String name) {
        String data = responseBuilder.getString("data", name);
        return data;
    }

    public String getData(String group, String name) {
        String data = responseBuilder.getString("data", group, name);
        return data;
    }

    public JSONArray getArray(String key) {
        JSONArray array = responseBuilder.getArray("data");
        return array;
    }

    public int getArraySize() {
        int size = responseBuilder.getArraySize("data");
        return size;
    }

    public String getDataAtIndex(String name, int index) {
        String data = responseBuilder.getStringAtIndex("data", name, index);
        return data;
    }

    public String getErrorData() {
        String data = responseBuilder.getString("data", "reason");
        return data;
    }
    public String getErrorData(String key) {
        String data = responseBuilder.getString("data", key);
        return data;
    }


    public String getResponse() {
        return responseBuilder.getResponse();
    }
}
