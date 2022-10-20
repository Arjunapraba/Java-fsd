package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.model.Admin;
@Repository
public interface Adminrepo extends JpaRepository<Admin, String> {

	@Query("Select a from Admin a where a.password=?1")
	public Optional<Admin> findByPassword(String password);
}
