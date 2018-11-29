package collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value
		 */
		
		
		Hashtable<Integer, String> h = new Hashtable(); 
        h.put(1,"ide"); 
        h.put(2,"rc");     
        
        		/*
        		 * => 1 is  Key
        		 * => ide is a value
        		 */
        
        String tool=h.get(2);
        System.out.println(tool);
        
        String t1=h.get(1);
        System.out.println(t1);
        
       
        
       Set<Integer> keys= h.keySet();
       for (Integer integer : keys) 
       {
    	   System.out.println(integer);
	   }
       
       
     
		
       
       
       
       
       
       
       
	}
       
}
