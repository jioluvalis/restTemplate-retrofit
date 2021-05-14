package com.retrofit.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;


import com.retrofit.demo.Retrofit.RetrofitCalls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

    @Autowired
    private RetrofitCalls reotrofitCalls;

    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping("/test")
    public Quote getQuote(RestTemplate restTemplate) {
        Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
        return quote;
    }

    @GetMapping("/retrofitTest")
    public Quote getRetrofitQuote() throws IOException {
        return reotrofitCalls.getQuote();
    }
}
