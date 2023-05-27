package com.quiz.system.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.system.Entities.Quiz;
import com.quiz.system.Services.QuizService;

@RestController
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	@GetMapping("/quizzes/all")
	public List<Quiz> getAllQuizzes() {
		
		return this.quizService.getAllQuiz();
		
	}
	
	@PostMapping("/quiz")
	public Quiz createQuiz(@RequestBody Quiz quiz) {
		
		return this.quizService.createQuiz(quiz);
	}
}
