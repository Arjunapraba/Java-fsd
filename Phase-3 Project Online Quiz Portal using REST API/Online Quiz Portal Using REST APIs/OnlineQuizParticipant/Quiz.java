package com.quiz.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Quiz {

	@Id
	private int quid;
	
	@Column
	private String qname;
	
	public int getQuid() {
		return quid;
	}
	public void setQuid(int quid) {
		this.quid = quid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}	
@OneToMany(mappedBy = "quiz")
private List<Questions> questions=new ArrayList<>();

public void setQuestions(List<Questions> questions) {
	this.questions = questions;
} 

}

