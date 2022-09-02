package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@Entity
@Table(name="Library")
@EnableTransactionManagement
public class Books {

@Id
@Column(name="Book_ID")
private int id;
@Column(name="Title_of_the_Book")
private String title;

@Column(name="Description_of_the_Book")
private String description;

@Column(name="Year_of_Release")
private int publishedyear;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getPublishedyear() {
	return publishedyear;
}

public void setPublishedyear(int publishedyear) {
	this.publishedyear = publishedyear;
}

public Books() {
	super();
}

}
