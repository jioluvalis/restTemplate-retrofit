package com.retrofit.demo.Retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static Retrofit getClient(){
        
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://quoters.apps.pcfone.io/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient.build())
        .build();

        return retrofit;
    }
}
