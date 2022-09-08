package com.quiz.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Marksrepo extends JpaRepository<Marks, Integer>{

	@Query("Select count(*) from Marks m where m.right_ans=1 and m.userid=?1")
	public int findbyRight(int id);
}
