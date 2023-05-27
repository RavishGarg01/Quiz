package com.quiz.system.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.system.Entities.Quiz;

@Service
public interface QuizService {

    public Quiz getQuiz(int id);
	
	public List<Quiz> getAllQuiz();
	
	public Quiz createQuiz(Quiz quiz);
	
	public Quiz updateQuiz(int id,Quiz quiz);
	
	public void deleteQuiz(int id);
}
