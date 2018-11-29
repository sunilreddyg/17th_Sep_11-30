package global_variables;

public class Run_Repository {

	public static void main(String[] args) 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		
		//Set browsername to global variable at runtime
		obj.browser_name="chrome";
		obj.launch_browser();
		
		
		
		//Set url to global variable at runtime
		obj.page_url="http://facebook.com";
		obj.load_webpage();

		
		
		//Test for user login
		obj.username="9030248855";
		obj.password="Hello12345";
		obj.User_login();
		obj.driver.findElement(obj.Singin_btn_locator).click();
	}

}
