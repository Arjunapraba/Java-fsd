package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Appcontroller {

	@ResponseBody
	@RequestMapping("/welcome")
	public String App() {
		String a="Deploying Spring boot Application on Cloud";
		return a;
	}
	@ResponseBody
	@RequestMapping("/deploy")
	public String deployApp() {
		String b="Deployed Application on AWS EC2";
		return b;
	}
}
