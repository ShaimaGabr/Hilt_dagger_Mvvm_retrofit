package com.example.hilt_dagger_mvvm_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetroServiceInterface {

    @GET("repositories")
    Call<RecyclerList> getDataFromGitHubApi(@Query("q") String query);
}