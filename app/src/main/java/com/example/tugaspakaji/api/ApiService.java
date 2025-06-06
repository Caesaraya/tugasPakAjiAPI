package com.example.tugaspakaji.api;

import com.example.tugaspakaji.model.TeamResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getAllTeams();

    @GET("search_all_teams.php?s=Soccer&c=Spain")
    Call<TeamResponse> getAllTeams2();
}