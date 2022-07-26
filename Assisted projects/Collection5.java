package assisted;

import java.util.*;


public class Collection5 {
public static void main(String[] args) {
	
	System.out.println("Array List");
	 ArrayList<String> arr = new ArrayList<String>();
	 arr.add("Arjun");
	 arr.add("Kishore");
	 arr.add("Vishnu");
	 arr.add("Bala");
	 System.out.println(arr);
	 
	 System.out.println("\nLinked List");
	 LinkedList<Integer> list = new LinkedList<Integer>();
	 list.add(1);
	 list.add(2);
	 list.add(3);
	 list.add(4);
	 Iterator<Integer> i= list.iterator();
	 while(i.hasNext())
		 System.out.println(i.next());
	 
	 System.out.println("\nVector");
	 Vector<String> v = new Vector<String>();
	 v.add("Python");
	 v.add("Arjun");
	 v.add("Java");
	 v.add("C++");
	 System.out.println(v);
	 
	 System.out.println("\nHash Set");
	 HashSet<Integer> h = new HashSet<Integer>();
	 h.add(8);
	 h.add(9);
	 h.add(10);
	 h.add(11);
	 System.out.println(h);
	 
	 System.out.println("\nLinkedhash Set");
	 LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
	 lh.add(89);
	 lh.add(63);
	 lh.add(95);
	 lh.add(44);
	 System.out.println(lh);
}
}
