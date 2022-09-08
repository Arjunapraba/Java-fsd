package com.quiz.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Adminrepo extends JpaRepository<Admin, Integer> {

 
	@Query("Select a from Admin a where a.username=?1")
	public Admin findByUsername(String username);

	@Query("Select a from Admin a where a.password=?1")
	public Admin findByPassword(String password);

}
