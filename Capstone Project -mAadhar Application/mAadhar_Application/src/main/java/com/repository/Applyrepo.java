package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.model.Application;

@Repository
public interface Applyrepo extends JpaRepository<Application, String> {

	@Query("Select a.name,a.emailid,a.aadhar_number,a.applicationId,a.status_of_application from Application a where a.mobno=?1")
	
	Object getByStatus(String mobno);	

}
