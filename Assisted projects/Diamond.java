package assisted;

interface Interface1  
{  
public default void display()   
{  
System.out.println("display() method of Interface1 invoked");  
}  
}  
interface Interface2  
{  
public default void display()   
{  
System.out.println("display() method of Interface2 invoked");  
}  
}  
public class Diamond implements Interface1, Interface2  
{  
public void display()   
{  
Interface1.super.display();  
Interface2.super.display();  
}  
public static void main(String args[])   
{  
Diamond s1 = new Diamond(); 
s1.display();  
}  
}  
