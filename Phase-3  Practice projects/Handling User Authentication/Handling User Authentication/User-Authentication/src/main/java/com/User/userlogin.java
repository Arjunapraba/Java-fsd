package com.User;
/*Username must have minimum 5 characters
  Password must be less than 8 characters
*/
public class userlogin {
 public String username(String uname)
	{
	 if(uname=="Arjun")
	 {
		 System.out.println("\nUsername valid");
	 }
		return uname;
	}

 
 public String password(String pwd)
 {
	 if(pwd=="Mypwd@123")
	 {
		 System.out.println("\nPassword valid");
	 }
	 return pwd;
 }
 
 public int authentication_pin(int pin)
 {
	 if(pin==12817)
	 {
		 System.out.println("\nAuthentication pin is valid");
	 }
 
	 return pin;
 }
 
}
