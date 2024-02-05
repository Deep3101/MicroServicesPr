package com.example.microservices.quizservice.repository;

import com.example.microservices.quizservice.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
