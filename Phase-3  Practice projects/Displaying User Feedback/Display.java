package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Display {
	@Id
	@Column(name="product_id")
	private int pid;
	@Column(name="product_name")
	private String pname;
	@Column(name="feedback")
	private String pfeedback;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {

		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPfeedback() {
		return pfeedback;
	}
	public void setPfeedback(String pfeedback) {
		this.pfeedback = pfeedback;
	}
	public Display() {
		super();
		// TODO Auto-generated constructor stub
	}
}
