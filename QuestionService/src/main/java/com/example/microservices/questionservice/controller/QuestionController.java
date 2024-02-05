package com.example.microservices.questionservice.controller;

import com.example.microservices.questionservice.entity.Question;
import com.example.microservices.questionservice.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    //create
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    //getall
    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }

    @PostMapping("/{questionId}")
    public Question getAll(@PathVariable Long questionId){
        return questionService.getOne(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
