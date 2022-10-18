package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/employee")
	public Employee data() {
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("ArjunKumar");
		e.setSalary(5000);
		return e;
	}
}