package com.example.microservices.questionservice.repository;

import com.example.microservices.questionservice.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    List<Question> findByQuizId(Long quizId);
}
