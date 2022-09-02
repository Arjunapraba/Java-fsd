package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepo extends JpaRepository<Books, Integer> {

	List<Books> findByPublishedyear(int publishedyear);

}
