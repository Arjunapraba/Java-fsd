package com.quiz.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Questionsrepo extends JpaRepository<Questions, Integer>{

	
	@Query("Select a from Questions a where a.answer=?1")
	public Questions findByAnswer(String answer);
	

}
