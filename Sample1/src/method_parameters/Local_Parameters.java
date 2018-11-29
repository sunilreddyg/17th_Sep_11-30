package method_parameters;

public class Local_Parameters 
{
	
	
	public void print_toolname()
	{
		String name="Webdriver";
		System.out.println(name);
	}
	
	public void print_toolname(String tname)
	{
		String name=tname;
		System.out.println(name);
	}
	
	
	public void print_toolname(String tname,double price)
	{
		String name=tname;
		System.out.println(name+"    "+price);
	}
	
	

	public static void main(String[] args)
	{
		//Create object for Class
		Local_Parameters obj=new Local_Parameters();
		obj.print_toolname();
		
		//Calling method with parameter
		obj.print_toolname("RC");
		obj.print_toolname("Grid");
		
		//Calling method with multiple parameters
		obj.print_toolname("IDE", 1000.00);

	}

}
