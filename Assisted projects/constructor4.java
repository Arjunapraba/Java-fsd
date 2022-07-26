package assisted;

public class constructor4 {
	int a,b;

	//default constructor
	constructor4(){
		
		String name="Arjun";
		int age=22;
		System.out.println("He is "+name+" and he's "+age+" old");
	}
	//parameterized constructor
	constructor4(int x,int y)
	{
		a=x;
		b=y;
	}
	void display(){
		int sum=a+b;
		System.out.println("The sum is "+sum);
	}
	
public static void main(String[] args) {
	constructor4 s1 = new constructor4(); 
	constructor4 s2 =new constructor4(8,6);
	s2.display();
	
	
}

}
