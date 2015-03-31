package com.orange.sc.soundcloudrand.rest.services;

import com.orange.sc.soundcloudrand.rest.models.Tracks;

import java.util.List;

import retrofit.Callback;
import retrofit.http.POST;

/**
 * Created by ggc on 31/03/15.
 */
public interface TracksServices {
    @POST("/tracks")
    public void getTracks(Callback<List<Tracks>> callback);
}
