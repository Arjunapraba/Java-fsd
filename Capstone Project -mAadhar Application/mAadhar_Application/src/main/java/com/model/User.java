package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class User {
    
	@Id
	@Column
	public String mobilenumber;
	@Column
	public String password;
		
	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
	}	
}
