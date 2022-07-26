package assisted;

public class innerclass7 {

	  int a=8,b=7;
	  int sum=a+b;
	 
	 
	 class innerclass1{  
	  void output(){
		  System.out.println("The sum of two numbers is "+sum);
		  }  
	 }  


	public static void main(String[] args) {

		innerclass7 s1=new innerclass7();
		innerclass7.innerclass1 s2=s1.new innerclass1();  //creating object for inner class
		s2.output();  
	}
}


