package com.controller;

import java.util.Date;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.model.Application;
import com.model.Cancel;
import com.model.Registration;
import com.model.User;
import com.repository.Applyrepo;
import com.repository.Cancelrepo;
import com.repository.Registerrepo;
import com.repository.UserRepo;

@RestController
public class user_controller {

	@Autowired
	UserRepo urepo;
	
	@Autowired
	Registerrepo repo;
	
	@Autowired
	Applyrepo arepo;
	
	@Autowired
	Cancelrepo crepo;
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/register")
	public Registration registeruser(@RequestBody Registration r)
	{
		return repo.save(r);
	}
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/login")
	public String userlogin(@RequestBody User u)
	{
     
		String mobno =u.getMobilenumber();
		String pwd = u.getPassword();
	    System.out.println(mobno+" "+pwd);
	    if(mobno!=null && pwd!=null)
	    {
	    if(repo.findByMobilenumber(mobno).equals(repo.findByPassword(pwd)))
	    {
	       urepo.save(u);
	       return "logged";
	    }
	    }
	    else
	    {
	    	return "Enter correct credentials";
	    }
		return "Register to Login" ;
      }
	 @CrossOrigin("http://localhost:4200")
	 @PostMapping("/applyaadhar")
	 public Application applynew(@RequestBody Application a)
	 {
		    Random r=new Random();
			int randomnumber=r.nextInt(999999);
			String formatted=String.format("%05d", randomnumber);
			Date dataapp = new Date();
			a.setDate_of_application(dataapp);
			//a.setCitizen_id(Integer.parseInt(formatted));
			//a.setApplicationId(Integer.parseInt(formatted)/2);
		    return arepo.save(a);
	 }
	 @CrossOrigin("http://localhost:4200")
	 @PostMapping("/updateAadhar")
		public Application updateaadhar(@RequestBody Application a )
		{
			 String mobno=a.getMobno();
			 arepo.deleteById(mobno);
			 return arepo.save(a);			
		}
	 @CrossOrigin("http://localhost:4200")
	 @GetMapping("/viewstatus/{mobno}")
	 public Object status(@PathVariable("mobno") String mobno){
       
         return arepo.getByStatus(mobno);
	 } 
	 @CrossOrigin("http://localhost:4200")
	 @PostMapping("/cancel")
	 public Cancel cancelrequest(@RequestBody Cancel c)
	 {
		return crepo.save(c); 
	 }
	 
	 @CrossOrigin("http://localhost:4200")
	 @GetMapping("/cancelrequests")
	 public List<Cancel> crequests()
	 {
		 return (List<Cancel>) crepo.findAll();
		 
	 }
	 
}


