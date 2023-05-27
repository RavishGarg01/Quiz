package com.quiz.system.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.system.Entities.Question;
import com.quiz.system.Entities.Quiz;

public interface QuestionRepo extends JpaRepository<Question,Integer> {

	List<Question> findByQuiz(Quiz quiz);

}
