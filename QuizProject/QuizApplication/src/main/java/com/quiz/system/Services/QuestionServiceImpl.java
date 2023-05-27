package com.quiz.system.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.system.Entities.Question;
import com.quiz.system.Entities.Quiz;
import com.quiz.system.Repositories.QuestionRepo;
import com.quiz.system.Repositories.QuizRepo;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	public QuestionRepo questionRepo;
	
	@Autowired
	public QuizRepo quizRepo;
	
	
   //Get Question by id

	@Override
	public Question getQuestion(int id) {
		
		return this.questionRepo.findById(id).get();
	}
	
	
	//Get all questions

	@Override
	public List<Question> getAllQuestions() {
		
		return this.questionRepo.findAll();
	}
	
	
	//Create New Question

	@Override
	public Question createQuestion(int quizid,Question question) {
		
		Quiz q= this.quizRepo.findById(quizid).get();
		
		
		
		Question q1=this.questionRepo.save(question);
		q1.setQuiz(q);
		
		return q1;
	}
	
	
	//Update Question

	@Override
	public Question updateQuestion(int id, Question question) {
		Question update= new Question();
		 Question q1=this.questionRepo.findById(id).get();
		 if(q1!=null) {
			 update.setId(id);
			 update.setOption1(q1.getOption1());
			 update.setOption2(q1.getOption2());
			 update.setOption3(q1.getOption3());
			 update.setOption4(q1.getOption4());
			 update.setAns(question.getAns());
			
			 
		 }
		return update;
	}

	
	
	//Delete Question
	
	@Override
	public void deleteQuestion(int id) {
		
		this.questionRepo.deleteById(id);
		
	}
	
	//GEt Question according to quiz

	@Override
	public List<Question> getQuestionByQuiz(int quizid) {
		
		Quiz quiz=this.quizRepo.findById(quizid).get();
		List<Question>li=this.questionRepo.findByQuiz(quiz);
		return li;
	}
	
	
	
	

}
