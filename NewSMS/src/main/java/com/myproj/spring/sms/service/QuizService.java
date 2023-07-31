package com.myproj.spring.sms.service;

import java.util.List;

import com.myproj.spring.sms.entities.Quiz;

public interface QuizService {
	
	public List<Quiz> saveNewQuiz(List<Quiz> q); 
	
	public List<Quiz> getQuiz(long id);

}
