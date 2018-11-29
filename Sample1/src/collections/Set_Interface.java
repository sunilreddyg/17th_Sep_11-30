package collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface 
{

	public static void main(String[] args) 
	{
		
		
		 Set<String> set=new HashSet<String>();
		 set.add("ide");
		 set.add("grid");
		 set.add("wd");
		 set.add("ide");
		 set.add("grid");
		 set.add("agile");
		 set.add("cucumber");
		
		 
		 //Get length of set
		 int count=set.size();
		 System.out.println("Size of set interface => "+count);
		 
		 
		 //Remove Object from set
		 set.remove("wd");
		 
		 //Verify Object contains at set
		 boolean flag=set.contains("wd");
		 System.out.println("object status => "+flag);
		 
		 
		 
		 //Verify Set Interface empty status
		 boolean flag1=set.isEmpty();
		 System.out.println("Set interface empty status =>"+ flag1);
		 
		 
		 
		 
		 //Iteate for Array next values
		 for (String eachtool : set) 
		 {
			System.out.println("=>"+eachtool);
		 }
		 
		
	}

}
