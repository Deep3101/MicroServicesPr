package com.example.microservices.quizservice.service;

import com.example.microservices.quizservice.entity.Quiz;

import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
