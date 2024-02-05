package com.example.microservices.questionservice.service;

import com.example.microservices.questionservice.entity.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
