package assisted_practice;

import java.util.LinkedList;
import java.util.Iterator;
public class Linkedlist {

	public static void main(String[] args) {
		  LinkedList<String> ll = new LinkedList<String>();
		  ll.addLast("December");
	        ll.addFirst("January");
	        ll.add(1,"February");
	        ll.add(2,"March");
	        ll.add(3,"April");
	        ll.add(4,"May");
	        ll.add(5,"June");
	        ll.add(6,"July");
	        ll.add(7,"August");
	        ll.add(8,"September");
	        ll.add(9,"October");
	        ll.add(10,"November");
	        
	        System.out.println(ll);
	        
	        System.out.println("Even Months are: ");
	        for(int i=0;i<ll.size();i++)
	        {
	        	if(i%2!=0)
	        		System.out.println(ll.get(i)+" ");
	        }
	        
	        System.out.println("Odd Months are: ");
	        for(int i=0;i<ll.size();i++)
	        {
	        	if(i%2==0)
	        		System.out.println(ll.get(i)+" ");
	        }
	       
	        System.out.println("Printing using Iterator");
	        java.util.Iterator<String> itr=ll.iterator();
	        while(itr.hasNext()) {
	        System.out.println(itr.next());
	        }
	        
	        System.out.println(ll.getFirst()+" and "+ll.getLast()+" are first and last months");
		  
	       
	       
	        
	        ll.remove(11);
	        System.out.println("After removing birthday month");
	        System.out.println(ll);

	        System.out.println("Checking for Winter Months");
	        if(ll.contains("December") || ll.contains("January"))
	        {
	        	System.out.println("It is present");
	        }
	        
	        
	        System.out.println(ll.peekFirst());
	        System.out.println(ll.peekLast());
	        System.out.println(ll.pollFirst());
	        System.out.println(ll.pollLast());
	}

}
