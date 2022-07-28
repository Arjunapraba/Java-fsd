package practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Emailvalidation {
	  public static void main(String[] args) {
		ArrayList<String> email = new ArrayList<String>();  
		email.add("arjun@gmail.com");  
		email.add("virat@hotmail.com");  
		email.add("guru@yahoo.com");  
		email.add("sewag@ipl.com");  
		email.add("sachin@legend.com");  
		System.out.println("Enter email ID: ");
		Scanner scn =new Scanner(System.in);
		String e = scn.next();
		for(int i=0; i<email.size();i++)
		{
			if(e.equals(email.get(i)))
			{
				System.out.println("Email Id is valid in the array");
				break;
			}
			if(i==(email.size()-1))
				System.out.println("Email Id is not valid in the array");
		}
	}
}
