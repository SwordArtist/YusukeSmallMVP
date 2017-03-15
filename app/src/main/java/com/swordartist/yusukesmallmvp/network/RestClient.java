package com.swordartist.yusukesmallmvp.network;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by Yusuke on 2016-03-08.
 */

public class RestClient {

    /**
     * @param endpointURL full URL for API call
     * @return JSONObject
     */
    public JSONObject call(String endpointURL) {

        String rowResponse = makeRequest(endpointURL);

        return parseJsonObject(rowResponse);
    }

    /**
     * Makes a request to given URL and convert the response into a String
     *
     * @param endpointURL
     * @return raw string response
     */
    public String makeRequest(String endpointURL) {
        
        HttpURLConnection urlConnection = null;
        StringBuffer apiResponse = new StringBuffer();
        try {
            URL url = new URL(endpointURL);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuffer buffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                apiResponse.append(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != urlConnection) {
                urlConnection.disconnect();
            }
        }
        return apiResponse.toString();
    }

    /**
     * Converts given string to JSONObject
     *
     * @param jsonString
     * @return
     */
    public JSONObject parseJsonObject(String jsonString) {
        JSONObject rootObject = null;
        if (null != jsonString) {
            try {
                rootObject = new JSONObject(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return rootObject;
    }
}
