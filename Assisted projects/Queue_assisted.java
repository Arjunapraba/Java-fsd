package assisted_practice;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_assisted
{
	public static void main(String[] args) 
	{
	        		Queue<String> q 	 = new LinkedList<>();
	                q.add("JAVA");
	        		q.add("PYTHON");
	        		q.add("C++");
	        		
	System.out.println("Queue is : " + q);
	        		System.out.println("Head of Queue : " + q.peek());
	        		q.remove();
	        		System.out.println("After removing Head of Queue : " + q);
	        		System.out.println("Size of Queue : " + q.size());
	    	}
	}

