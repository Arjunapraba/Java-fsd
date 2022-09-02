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
	Bookrepo repo;
	@Autowired
	Books book;
	//1
	@GetMapping("/allbooks")
	@Transactional
	public List<Books> getAllBooks()   
	{  
	return (List<Books>) repo.findAll();  
	}  
	//2
	@GetMapping("/books/{id}")
	@Transactional
	public Optional<Books> getBookbyId(@PathVariable("id") int id)
	{
		return repo.findById(id);
	}
	//3
	@PutMapping("/deletebooks/{id}")
	@Transactional
	public  void deleteBookbyId(@PathVariable("id") int id)
	{
	 repo.deleteById(id);
	}
	//4
	@PutMapping("/deleteAllbooks")
	public  void deleteAllBooks()
	{
	 repo.deleteAll();
	}
	//5
	@GetMapping("getbyyear/{publishedyear}")
	@Transactional
	public @ResponseBody List <Books> findByPublishedyear(@PathVariable("publishedyear") int publishedyear)
	{
		return repo.findByPublishedyear(publishedyear);
	}
	//6
	@PostMapping("/uploadbook")
	public Books create(@RequestBody Books b)
	{
		book.setId(b.getId());
		book.setTitle(b.getTitle());
		book.setDescription(b.getDescription());
		book.setPublishedyear(b.getPublishedyear());
		repo.save(book);
		return book;		
	}
	//7
	@PutMapping("/updating/{id}")
	public @ResponseBody Books updating(@PathVariable("id") int bid,@RequestBody Books b)
	{
		book.setId(bid);
		repo.delete(book);
		book.setId(bid);
		book.setTitle(b.getTitle());
		book.setDescription(b.getDescription());
		book.setPublishedyear(b.getPublishedyear());
		repo.save(book);
		return book;
	}	
}
