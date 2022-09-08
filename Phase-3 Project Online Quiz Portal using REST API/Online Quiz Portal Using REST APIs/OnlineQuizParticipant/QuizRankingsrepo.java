package com.quiz.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuizRankingsrepo extends JpaRepository<QuizRankings, Integer> {

	@Query("Select r from QuizRankings r order by r.marksobtained desc")
	public List<QuizRankings> rankbymarks();
}
