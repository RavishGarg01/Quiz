package com.quiz.system.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.system.Entities.Question;
import com.quiz.system.Services.QuestionService;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/questions/{quizid}")
	public Question createQuestion(@PathVariable("quizid") int quizid,@RequestBody Question question) {
		
		return this.questionService.createQuestion(quizid,question);
	}
	
	@GetMapping("/{quizid}")
	public List<Question> getQuestionsByQuiz(@PathVariable("quizid") int quizid){
		return this.questionService.getQuestionByQuiz(quizid);
		
	}
	
	@GetMapping("question/{qid}")
	public Question getQuestionById(@PathVariable("qid")int qid) {
		
		return questionService.getQuestion(qid);
		
	}
	
	

}
