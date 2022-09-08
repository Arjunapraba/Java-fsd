package com.quiz.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{

	@Query("Select a from User a where a.username=?1")
	public User findByUsername(String username);

	@Query("Select a from User a where a.password=?1")
	public User findByPassword(String password);
    
	@Query("Select a from User a where a.userid=?1")
	public User findByUserId(int userid);
	

}
