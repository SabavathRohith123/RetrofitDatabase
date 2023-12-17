package com.example.retrofitdatabase.repository;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.retrofitdatabase.model.Question;
import com.example.retrofitdatabase.model.QuestionList;
import com.example.retrofitdatabase.serviceapi.QuestionApiService;
import com.example.retrofitdatabase.serviceapi.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuizRepository {
    QuestionApiService questionApiService;

    public QuizRepository() {
        this.questionApiService = new RetrofitInstance().getRetrofitInstance();
    }

    public LiveData<QuestionList> getQuestionFromApi() {
        MutableLiveData<QuestionList> data = new MutableLiveData<>();
Call<QuestionList> call=questionApiService.getquestions();
call.enqueue(new Callback<QuestionList>() {
    @Override
    public void onResponse(Call<QuestionList> call, Response<QuestionList> response) {
        QuestionList questions = response.body();
                data.setValue(questions);

    }

    @Override
    public void onFailure(Call<QuestionList> call, Throwable t) {

    }
});
return data;


    }
}
