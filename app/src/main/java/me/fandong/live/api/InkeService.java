package me.fandong.live.api;

import me.fandong.live.model.LiveResponseEntry;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface InkeService {
    @GET("api/live/near_recommend")
    Call<LiveResponseEntry> listLive(@Query("uid") String uid);
}
