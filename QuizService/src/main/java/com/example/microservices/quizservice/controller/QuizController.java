package com.example.microservices.quizservice.controller;

import com.example.microservices.quizservice.entity.Quiz;
import com.example.microservices.quizservice.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    //getall
    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }

}
