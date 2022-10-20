package com.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Admin {
    @Id
	public String username;
	public String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin() {
		super();
	}	
}
