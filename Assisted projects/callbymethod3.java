package assisted;

public class callbymethod3{
	
 	int b,h;
 	String s;
 	int Area;
 	callbymethod3(){
 		float x,y;
 		int d1,d2; 
 	}
 	callbymethod3(int a)
	{
	Area=a*a;
	s="Square";
	}
 	callbymethod3(int b,int h)
	{
		Area =b*h;
		s="Rectangle";
	}
 	callbymethod3(float r)
	{
		Area=(int)((int)3.14*r);
		s="Circle";
	}
	public int area(float d1,int d2)
	{
		return  (int) ((int)d1*d2);
		
	}
	public int area(int x,int y)
	{
		return (int)(0.5*x*y);
		
	}
	void display(){
		System.out.println("The Area of "+s+" is :"+Area);
	}
public static void main(String[] args) {
	//using constructor overloading
	callbymethod3 s1= new callbymethod3(5);
	callbymethod3 s2= new callbymethod3(8,6);
	callbymethod3 s3= new callbymethod3(6f);
	callbymethod3 m1=new callbymethod3();
	callbymethod3 m2=new callbymethod3();
	//using Method overloading 
	int c=m1.area(14f,8);
	int g=m2.area(8,7);
	s1.display();
	s2.display();
	s3.display();
	 System.out.println("The Area of Rhombus: "+c);
	 System.out.println("The Area of Triangle: "+g);
	}
}
