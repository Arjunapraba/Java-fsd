package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Registration;
@Repository
public interface Registerrepo extends JpaRepository<Registration,Integer> {

	@Query("Select a from Registration a where a.mobilenumber=?1")
	public Registration findByMobilenumber(String string);

	@Query("Select a from Registration a where a.password=?1")
	public Registration findByPassword(String string);
}
