package assisted;
class testA{
	int av;
//public access modifier	
public int output(int a,int b) {
	int c=a+b;
	System.out.println("The output is: "+c);
	return c;
	}
//private access modifier
private int area(int l,int b) {
	int ar=l*b;
	return ar;
}
//protected access modifier
protected int average(int x,int y)
{
	int avg=(x+y)/2;
	System.out.println("The average is: "+avg);
	return avg;
}
}
class testB extends testA{
	//default access modifier
	String display(String s) {
		return s;
	}
}

public class AccessSpecifiers2 {
public static void main(String[] args) {
	testB s1 =new testB();
	s1.average(5,15); //protected class member accessed by child class
	s1.output(9,5);  //public class member accessed by child class
}
}
