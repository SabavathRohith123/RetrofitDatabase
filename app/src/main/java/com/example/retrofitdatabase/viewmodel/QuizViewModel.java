package com.example.retrofitdatabase.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.retrofitdatabase.model.QuestionList;
import com.example.retrofitdatabase.repository.QuizRepository;

public class QuizViewModel extends ViewModel {
    QuizRepository repository = new QuizRepository();


    LiveData<QuestionList> questionListLiveData;

    public QuizViewModel(){
        questionListLiveData = repository.getQuestionFromApi();
    }

    public LiveData<QuestionList> getQuestionListLiveData() {
        return questionListLiveData;
    }
}
