package com.retrofit.demo.Retrofit;

import java.io.IOException;

import com.retrofit.demo.Quote;

import org.springframework.stereotype.Service;

import retrofit2.Call;
import retrofit2.Response;

@Service
public class RetrofitCalls {
    
    private RetrofitService retrofitService = ApiClient.getClient().create(RetrofitService.class);

    public Quote getQuote() throws IOException { 
        Call<Quote> call = retrofitService.getQuote();
        Response<Quote> response = call.execute();

        if (!response.isSuccessful()){
            throw new IOException(response.errorBody() != null
                ? response.errorBody().string() : "Error desconocido");
        }

        return response.body();
    }
}
