package com.quiz.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Questions {

	@Id
	@Column
	private int id;
	
	@ManyToOne
	private Quiz quiz;
	
	@Column
	private String question;
	
	@Column
	private String op1;
	
	@Column
	private String op2;
	
	@Column
	private String op3;
	
	@Column
    private String op4;

    @Column
    private String answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getOp4() {
		return op4;
	}

	public void setOp4(String op4) {
		this.op4 = op4;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}	
}
