package com.quiz.system.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.system.Entities.Quiz;
import com.quiz.system.Repositories.QuizRepo;

@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	public QuizRepo quizRepo;
	
	
	//Get Quiz By Id

	@Override
	public Quiz getQuiz(int id) {
		
		return this.quizRepo.findById(id).get();
	}
	
	//Get All Quizes

	@Override
	public List<Quiz> getAllQuiz() {
		
		return this.quizRepo.findAll();
	}
	
	
	//Create New Quiz

	@Override
	public Quiz createQuiz(Quiz quiz) {
		Quiz q=this.quizRepo.save(quiz);
		
		return q;
	}
	
	//Update quiz

	@Override
	public Quiz updateQuiz(int id, Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//Delete quiz

	@Override
	public void deleteQuiz(int id) {
		
		this.quizRepo.deleteById(id);
		
	}

}
