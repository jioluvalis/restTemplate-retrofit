package com.retrofit.demo.Retrofit;

import com.retrofit.demo.Quote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    
    @GET("random")
    Call<Quote> getQuote();
    

}
