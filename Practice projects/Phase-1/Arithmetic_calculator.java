package practice;
import java.lang.*;
import java.util.Scanner;
import java.lang.Math;

public class Arithmetic_calculator {

public static void main(String[] args) {
   float n1,n2;
   char p;
   float x=0;
   Scanner sc =new Scanner(System.in);
   //take the input
   System.out.println("Enter the first Number: ");
   n1=sc.nextFloat();
   System.out.println("Enter the next Number: ");
   n2=sc.nextFloat();
   
   //enter the operation to be performed
   System.out.println("Enter the operation to be calculated: ");
   
   p=sc.next().charAt(0);  //get the operator as input
   
   switch(p) {
   
   //if addtion is needed
   case '+':
	   x=n1+n2;
	   break;
   //if subraction is needed  	      
   case '-':
	   x=n1-n2;
	   break;
   //if multiplication of two numbers	   
   case '*':
	   x=n1*n2;
	   break;
   //if Division of two numbers
   case '/':
	   x=n1/n2;
	   break;
   //if other inputs than this operators entered
   default:
	   System.out.println("The input given is wrong");
	   break;
   }
   System.out.println("\nThe output is "+n1+" "+p+" "+n2+" = "+x);
   
   }
}
   
 



