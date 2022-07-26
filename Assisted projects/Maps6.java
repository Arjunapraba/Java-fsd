package assisted;
import java.util.*;

public class Maps6 {

	public static void main(String[] args) {
				//Hashmap
			HashMap<Integer,String> a=new HashMap<Integer,String>();      
			      a.put(1,"Arjun");    
			      a.put(2,"Vishnu");    
			      a.put(3,"Kishore");   
			       
			      System.out.println("\nUsing Hashmap");  
			      for(Map.Entry x:a.entrySet()){    
			       System.out.println(x.getKey()+""+x.getValue());    
			      }
			      
			     //HashTable
			 Hashtable<String,Integer> b=new Hashtable<String,Integer>();  
			      b.put("Maths:",89);  
			      b.put("Physics:",96);
			      b.put("Chemistry:",92);

			      System.out.println("\nUsing Hashtable");  
			      for(Map.Entry x:b.entrySet()){    
			       System.out.println(x.getKey()+""+x.getValue());    
			      }
			      
			      
			      //TreeMap
			  TreeMap<Integer,String> c=new TreeMap<Integer,String>();    
			      c.put(1,"Java");    
			      c.put(2,"C++");    
			      c.put(3,"Python");       
			      
			      System.out.println("\nUsing Treemap");  
			      for(Map.Entry x:c.entrySet()){    
			       System.out.println(x.getKey()+""+x.getValue());    
			      }    
			      
			   }  
		}




