package com.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class authenticationtests {

userlogin ulog ;
	
	@BeforeEach
	void intEach() {
		ulog = new userlogin();
	}
	
	@Test
	public void usercheck() {
		
		String expected="Arjun";
		
		String actual=ulog.username("Arjun"); 
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void password_check() {
		
		String expected ="Mypwd@123";
		
		String actualpwd=ulog.password("Mypwd@123");
		
		Assertions.assertEquals(expected, actualpwd);
	}
	
	@Test
	public void authpin_check()
	{
		int expected=12817;
		
		int actualpin=ulog.authentication_pin(12817);
		Assertions.assertEquals(expected, actualpin);
	}
	
	@Test
	public void username_possibilitycheck()
	{
	String uname=ulog.username("Arjun");
	
	int ulen=uname.length();
	
	int expected=5;
	
	while (uname != null)
	{
	if(ulen >= expected)
	{
	System.out.println("\nUsername is Correct");
	break;
	}
	}
	}
	@Test
	public void password_possibilitycheck()
	{
	String upwd=ulog.password("Mypwd@123");
	
	int pwdlen=upwd.length();
	
	int expected=12;
	
	while (upwd != null)
	{
	if(pwdlen <= expected)
	{
	System.out.println("\nPassword is Valid by Junit test");
	break;
	}
	}
  }
}
