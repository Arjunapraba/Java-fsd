package assisted_practice;

import java.io.*; 
import java.util.*; 

public class Stack_assisted { 
 public static void main(String[] args) 
 { 
     
     Stack<String> stack = new Stack<String>();
     System.out.println("Inserting elements into the Stack");
     
     stack.push("Python"); 
     stack.push("Fortran"); 
     stack.push("CSS"); 
     
    System.out.println(stack); 
 
      
     System.out.println("Popped element from stack 1: " + stack.pop()); 
     System.out.println("Popped element from stack 2: " + stack.pop());      
 } 
}