package com.quiz.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Marks {

	@Id
	@GeneratedValue
	private int no;
	@Column
	private int userid;
	@Column
	private String username;
	@Column
	private int qid;
	@Column
	private int right_ans; //using 1 for correct answer
	@Column
	private int wrong_ans; //using 0 for wrong answer
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getRight_ans() {
		return right_ans;
	}
	public void setRight_ans(int right_ans) {
		this.right_ans = right_ans;
	}
	public int getWrong_ans() {
		return wrong_ans;
	}
	public void setWrong_ans(int wrong_ans) {
		this.wrong_ans = wrong_ans;
	}
	
}
