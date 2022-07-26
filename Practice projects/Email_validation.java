package practice;
import java.util.*; 
import java.util.regex.*;     
public class Email_validation {

	    public static void main(String args[]){  
	    
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        
	        Pattern pattern = Pattern.compile(regex);  
	        
	    	System.out.println("Enter email ID: ");
			Scanner sc =new Scanner(System.in);
			String email = sc.next();
	       
	        Matcher matcher = pattern.matcher(email);  
	        System.out.println(email +" : "+ matcher.matches()+"\n");  
	         
	    }  
	}  

