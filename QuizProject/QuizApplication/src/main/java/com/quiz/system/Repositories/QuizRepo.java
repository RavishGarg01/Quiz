package com.quiz.system.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.system.Entities.Quiz;

public interface QuizRepo extends JpaRepository<Quiz,Integer>{
    Quiz getByActive(Boolean active);
}
