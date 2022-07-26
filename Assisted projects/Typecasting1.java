package assisted;

public class Typecasting1 {

	public static void main(String[] args) {
		
		int age=36;
		long l=age;
		long var=8646846L;
		double d=164635.353;
		float a=var;            
		float b=age;            
		double d1=a;
		char c='g';
		int n=c; 
		System.out.println("Implicit Conversion");
		System.out.println("integer to long: "+l);
		System.out.println("long to float: "+a);
		System.out.println("integer to float: "+b);
		System.out.println("integer to double: "+d1);
		System.out.println("character to integer: "+n);
		
		
		int n2=(int)a;           
		float f=(float)d;    
		char c1=(char)n;        
		byte by= (byte)n2;         
		System.out.println("\nExplicit Conversion");
		System.out.println("float to integer: "+n2);
		System.out.println("double to float : "+d);
		System.out.println("integer to character: "+c1);
		System.out.println("integer to byte :"+by);
		

	}

}
