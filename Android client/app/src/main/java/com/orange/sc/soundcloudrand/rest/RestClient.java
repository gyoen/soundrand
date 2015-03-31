package com.orange.sc.soundcloudrand.rest;

import com.orange.sc.soundcloudrand.rest.services.TracksServices;


import retrofit.RestAdapter;

/**
 * Created by ggc on 31/03/15.
 */
public class RestClient {
    private static final String BASE_URL = "http://10.0.1.72:3000";
    private RestAdapter mRestAdapter;
    private TracksServices mTracksServices;
    private static RestClient restClient;

    public RestClient(){
        mRestAdapter = new RestAdapter.Builder()
                .setEndpoint(BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
               // .setRequestInterceptor(requestInterceptor)
                .build();

        mTracksServices = mRestAdapter.create(TracksServices.class);
    }

    public static RestClient getInstance(){
        if( null == restClient){
            restClient = new RestClient();
        }
        return restClient;
    }

    public TracksServices getTracksServices() {
        return mTracksServices;
    }


}
