package assisted;


public class CustomException {
	static void Salary(int salary)throws Salaryexception{
		System.out.println("Your Salary is "+salary);
	if(salary<2100) {
		throw new Salaryexception("you need to work hard");
	}
	else if(salary>=2100 && salary<=5000) {
		throw new Salaryexception("your salary is somehow good");
	}
	else if(salary >=5100 && salary<=9000) {
		throw new Salaryexception("salary is very good");
	}
	}

	public static void main(String[] args) {

		 try{  
		        Salary(5500);  
		      }
		      catch(Exception s)
		      {
		    	  System.out.println("Exception occured: "+ s.getMessage());
		      }  
		  }  
	}

	class Salaryexception extends Exception{
		Salaryexception( String s){
		super(s);
		}
	}
