package com.example.michell.appfromscratch;

import retrofit2.Call;
import retrofit2.http.GET;

//create a api that handles the request to the server

public interface AndroidService {

    @GET("android/jsonandroid/")
    Call<Android> getAndroid();
}
