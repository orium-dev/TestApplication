package com.orium.testapplication.network;

import com.orium.testapplication.model.SalonsResponse;

import retrofit.Call;
import retrofit.http.GET;

public interface TestWebApi {

    @GET("/v1/salons")
    Call<SalonsResponse> getSalons();

}
