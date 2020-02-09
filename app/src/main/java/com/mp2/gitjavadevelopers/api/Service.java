package com.mp2.gitjavadevelopers.api;

import com.mp2.gitjavadevelopers.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/search/users?q=language:java+location:canada")
    Call<ItemResponse> getItems();
}
