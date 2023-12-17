package com.example.retrofitdatabase.serviceapi;

import com.example.retrofitdatabase.model.Question;
import com.example.retrofitdatabase.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionApiService {
    @GET("myquizapi.php")
    Call<QuestionList> getquestions();
}
