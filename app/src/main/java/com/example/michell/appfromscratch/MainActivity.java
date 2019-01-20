package com.example.michell.appfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = Retrofitsingleton.getInstance();

        retrofit.create(AndroidService.class)
                .getAndroid()
                .enqueue(new Callback<Android>() {
                    @Override
                    public void onResponse(Call<Android> call, Response<Android> response) {

                    }

                    @Override
                    public void onFailure(Call<Android> call, Throwable t) {

                    }
                });
    }
}
