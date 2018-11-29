package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * List : Can contain duplicates and elements are ordered. Example
       	 *		implementations are LinkedList (linked list based) and
       	 *   	ArrayList (dynamic array based)
		 */
		
		
		 List<String> list=new ArrayList<String>();
		 list.add("ide");
		 list.add("rc");
		 list.add("wd");
		 list.add("ide");
		 list.add("grid");
		 list.add("agile");
		 
		 
		 //Apply foreach
		 for (String eachtool : list) 
		 {
			System.out.println("=>"+eachtool);
		 }
		 
		 
		 /*
		  * Becuase list maintain order we can get any single object
		  * from list using << get >> keyword.
		  * 
		  * 	<<get>> method access single object from list usind
		  * 	index number.
		  */
		String toolname=list.get(3);
		System.out.println("toolname at 3rd index is => "+toolname);
		 
		 
		 //Apply for loop
		for (int i = 0; i < list.size(); i++) 
		{
			String tool=list.get(i);
			System.out.println("=> "+tool);
		}
		 
		 
		 
	}

}
