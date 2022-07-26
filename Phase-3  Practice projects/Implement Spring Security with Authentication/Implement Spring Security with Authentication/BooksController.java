package com.example.demo;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksController {
	@Autowired
	Repository repo;
	@Autowired
	Books book;

	@GetMapping("/allbooks")
	@Transactional
	public List<Books> getAllBooks()   
	{  
	return (List<Books>) repo.findAll();  
	}  	
}
