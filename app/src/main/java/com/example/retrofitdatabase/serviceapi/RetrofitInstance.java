package com.example.retrofitdatabase.serviceapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static String   BaseUrl = "http://10.0.2.2/myapi/";
    private static Retrofit retrofit= null;

    public QuestionApiService getRetrofitInstance(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory
                    (GsonConverterFactory.create()).build();
        }
        return retrofit.create(QuestionApiService.class);
    }
}
