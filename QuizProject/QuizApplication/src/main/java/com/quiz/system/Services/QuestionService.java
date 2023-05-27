package com.quiz.system.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.system.Entities.Question;

@Service
public interface QuestionService {
	
	public Question getQuestion(int id);
	
	public List<Question> getAllQuestions();
	
	public Question createQuestion(int quizid,Question question);
	
	public Question updateQuestion(int id,Question question);
	
	public void deleteQuestion(int id);
	
	public List<Question> getQuestionByQuiz(int quizid);

}
