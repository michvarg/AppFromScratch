package com.example.michell.appfromscratch;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Singleton class for Retrofit Instance

public class Retrofitsingleton {
    private static Retrofit singleton;

    public static Retrofit getInstance(){
        if (singleton != null){
            return singleton;
        }
        singleton = new Retrofit.Builder()
                .baseUrl("https://api/learn2crack.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return singleton;

  }

  private Retrofitsingleton(){}
}
