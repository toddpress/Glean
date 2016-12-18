package com.glean.guideBoxAccessLayaer;

/**
 * Created by justi on 12/17/2016.
 */

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by justin on 10/30/2016.
 */
public class URLCaller {

    OkHttpClient client = new OkHttpClient();

    public String makeCall(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
