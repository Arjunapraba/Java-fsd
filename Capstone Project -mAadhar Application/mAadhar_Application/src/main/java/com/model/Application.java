package com.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Applied_Citizens")
@Component
public class Application {

	@Id
	@Column(name="Mobile_number")
	public String mobno;
	@Column(name="Citizen_name")
	public String name;
	@Column(name="Date_of_Birth")
	public String dob;
	public String address;
	@Column(name="Email_Id")
	public String emailid;
	@Column(name="Gender_of_Citizen")
	public String gender;
	public String aadhar_number;
	public long applicationId;
	public String status_of_application;
	public Date date_of_application;
	public String Issue_date;
	public long citizen_id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public String getStatus_of_application() {
		return status_of_application;
	}

	public void setStatus_of_application(String status_of_application) {
		this.status_of_application = status_of_application;
	}

	public Date getDate_of_application() {
		return date_of_application;
	}

	public void setDate_of_application(Date dataapp) {
		this.date_of_application = dataapp;
	}

	public String getIssue_date() {
		return Issue_date;
	}

	public void setIssue_date(String issue_date) {
		Issue_date = issue_date;
	}

	public long getCitizen_id() {
		return citizen_id;
	}

	public void setCitizen_id(long citizen_id) {
		this.citizen_id = citizen_id;
	}

	public Application() {
		super();
	}
           		
}
