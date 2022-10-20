package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.model.Admin;
import com.model.Application;
import com.repository.Adminrepo;
import com.repository.Applyrepo;

@RestController
public class Admincontroller {

	
@Autowired
Adminrepo arepo;
@Autowired
Applyrepo repo;
    @CrossOrigin("http://localhost:4200")  
	@GetMapping("/adminlogin")
	public String adminlogin(@RequestBody Admin a)
	{
		String username=a.getUsername();
		String password=a.getPassword();
		if(username!=null && password!=null)
		{
			if(arepo.findById(username).equals(arepo.findByPassword(password)))
					{
				        return "Login Successful";
					}
			else
			{
				return "Oops Username or password incorrect";
			}
		}
		else
		{
			return "Please enter the valid details";
		}
	}

@CrossOrigin("http://localhost:4200")
@GetMapping("/showAll")
public List<Application> showAllapplicants()
{
	return (List<Application>) repo.findAll();
}
}