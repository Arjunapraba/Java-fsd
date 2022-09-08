package com.quiz.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuizRankings {
 

	@Id
	private int userid;
	@Column
	private int marksobtained;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getMarksobtained() {
		return marksobtained;
	}
	public void setMarksobtained(int marksobtained) {
		this.marksobtained = marksobtained;
	}	
	
}
