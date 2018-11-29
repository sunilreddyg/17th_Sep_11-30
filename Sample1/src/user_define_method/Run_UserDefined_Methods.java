package user_define_method;

public class Run_UserDefined_Methods {

	public static void main(String[] args) 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.browserlaunch("chrome");
		obj.LoadApp("http://facebook.com");
		obj.setTimeout(30);
		
		
		//Verify facebook hompeage title
		if(obj.Istitle_Presented("Facebook"))
			System.out.println("title presented");
		else
			System.out.println("title not presented");

		
		//Verify text presented at webpage
		if(obj.is_textVisible_Atpage("Create an account"))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpage");
	}

}
