package com.quiz.demo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@Autowired
	Adminrepo arepo;
	
	@Autowired
	Quizrepo qrepo;
	
	@Autowired
	Questionsrepo quesrepo;
	
	//Admin login check
	@ResponseBody
	@RequestMapping("/validate")
	public String validateadmin(@RequestBody Admin a)
	{

		String username=a.getUsername();
	    String password=a.getPassword();
	    String res="";
	    
	    if((arepo.findByUsername(username)!=null)&&(arepo.findByPassword(password)!=null))
	    {
	    if(arepo.findByUsername(username).equals(arepo.findByPassword(password)))
	       res="Logged In Successfully...Welcome Admin!!!";
	    }
	    else
	    {
	    	res="Invalid Credentials please enter Correctly";
	    }
	    return res;
    }
	//Admin to update password
	@PutMapping("/validate/updatepassword")
	public Admin changePassword(@RequestBody Admin a)
	{
	  return arepo.save(a);
	}
	
	//Admin to insert a question
	@PostMapping("/insertquestion")
	private Questions insert(@RequestBody Questions q)
	{
		return quesrepo.save(q);
	}
	
	//Admin to see all the Questions along with their quiz id
	@RequestMapping("/find/allques")
	public List<Questions> allques()
	{
		return quesrepo.findAll();
		
	}
	   //Admin to see all available quiz
		@RequestMapping("/find/allquiz")
		public List<Quiz> allquiz()
		{
			return qrepo.findAll();
			
		}
	//Admin to select particular quiz
	@RequestMapping("/find/allquiz/{quid}")
	public Optional<Quiz> allquesbyid(@PathVariable(name="quid") int quid)
	{
		return qrepo.findById(quid);
	}
}
