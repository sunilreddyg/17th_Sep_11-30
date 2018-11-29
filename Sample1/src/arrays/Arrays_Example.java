package arrays;

public class Arrays_Example {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Arrays:--> Array store  set of events into single variable.
		 */
		
		//Static Array 
		String tools[]=new String[4];
		tools[0]="IDE";
		tools[1]="WB";
		tools[2]="GRID";
		tools[3]="RC";
		
		System.out.println("Print second index value => "+tools[2]);
		System.out.println("Get length of array => "+tools.length);
		
		
		//for:--> loop iterate expected range.
		for (int i = 0; i < tools.length; i++) 
		{
			String toolname=tools[i];
			System.out.println("toolname is => "+toolname);
		}
		
		
		//Create new line at console
		System.out.println("\n");
		
		
		
		//Runtime Array
		String usernames[]={"arjun","vijay","hari","sam","user1"};
		System.out.println("get first index value => "+usernames[1]);
		System.out.println("Length of runtime array => "+usernames.length);
		
		
		
		//foreach:--> Foreach is designed to read array next values
		for (String Eachname : usernames) 
		{
			System.out.println("=>"+Eachname);
		}
		
		

	}

}
