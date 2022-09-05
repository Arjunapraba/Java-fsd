package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {

	@Autowired
	private Displayrepo repo;	
	
	@RequestMapping("/addfeedback")
	public String addfeedback(Display display)
	{
		repo.save(display);
		return "home.jsp";
	}
}