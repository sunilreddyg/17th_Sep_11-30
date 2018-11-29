package user_define_method;

public class Method_ReturnTypes 
{
	
	/*
	 * note:--> 
	 * 	=> For void methods no need to write return keyword
	 * 	=> for other method type we must write return keyword.
	 * 
	 */
	
	
	public void method1()
	{
		//void method doesn't any value
	}
	
	
	public String method2()
	{
		return "Hello";
	}
	
	/*
	 * Note:--> Otherthan void we must write return keyword
	 * 			=> Return value should match with type of method
	 * 			=> It return value to method name
	 */
	
	
	public int cal(int a, int b)
	{
		return a+b;
	}
	
	

	public static void main(String[] args) 
	{
		//Object creation for class
		Method_ReturnTypes obj=new Method_ReturnTypes();
		
		//Calling void method
		obj.method1();
		
		//Calling other method types
		String value=obj.method2();
		System.out.println(value);
		
		//Calling int method type with method parameters
		int total=obj.cal(100, 200);
		System.out.println(total);

	}

}
