package com.quiz.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {


	@Autowired
	Marksrepo mrepo;
	
	@Autowired
	UserRepo urepo;
	
	@Autowired
	Quizrepo qrepo;
	
	@Autowired
	Questionsrepo quesrepo;
	
	@Autowired
	QuizRankingsrepo rrepo;

	
	@ResponseBody
	@RequestMapping("/user/login")
	public String validate(@RequestBody User u)
	{
		int userid=u.getUserid();
		String username=u.getUsername();
		String password=u.getPassword();
		String res="";
		if((urepo.findByUserId(userid)!=null)
				&&(urepo.findByUsername(username)!=null)&&(urepo.findByPassword(password)!=null))
		{
		if(urepo.findByUsername(username).equals(urepo.findByPassword(password)))
		{
			res= "You have already attempted the Quiz...Only once it is permitted!!!";
			
		}
		}
		else
		{
			urepo.save(u);
			res= "Welcome to the Online Quiz....Lets Begin!!!";
		}	
		
		return res;
	}
	
	   //participant to see all available quiz
	   @RequestMapping("/find/allquiz")
	   public List<Quiz> allquiz()
	   {
		return qrepo.findAll();
	 	
	   }
	    //participant to select particular quiz
		@RequestMapping("/find/allquiz/{id}")
		public Optional<Quiz> allquesbyid(@PathVariable int id)
		{
			return qrepo.findById(id);
		}
		String t="";
		@RequestMapping("/takequiz")
		public String answer(@RequestParam(name="userid") int userid,
				@RequestParam(name="username") String username,
				@RequestParam(name="answer") String ans,
				@RequestParam(name="qid") int questionid)
		{

			Questions q=quesrepo.findById(questionid).orElse(null);
			System.out.println(q);
		    Questions qa=quesrepo.findByAnswer(ans);
		    System.out.println(qa);
		    Marks m=new Marks();
		    if(q.equals(qa))
		    {	
		    	m.setRight_ans(1);
		    	m.setWrong_ans(0);
		    	m.setUserid(userid);
		    	m.setUsername(username);
		    	m.setQid(questionid);
		    	mrepo.save(m);
		    	t="Correct Answer...Enter the next question and proceed";
		    }
		    else
		    {
		    	m.setRight_ans(0);
		    	m.setWrong_ans(1);
		    	m.setUserid(userid);
		    	m.setUsername(username);
		    	m.setQid(questionid);
		    	mrepo.save(m);
		    	t="OOps Wrong Answer";
		    }
		    return t;
		}
		
		@RequestMapping("answer/right/{userid}")
		public int find(@PathVariable(name="userid") int id)
		{
			return mrepo.findbyRight(id);
		}
		
		
		@RequestMapping("/quizrankings")
		public List<QuizRankings> rankings()
		{
			return rrepo.rankbymarks();
		}
}
