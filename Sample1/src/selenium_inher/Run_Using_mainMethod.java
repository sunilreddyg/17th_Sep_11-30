package selenium_inher;


public class Run_Using_mainMethod 
{
	
	
	
	public static void main(String args[]) throws Exception
	{
		
		 Testcase obj=new Testcase();
		 obj.BrowserLaunch("chrome");
		 obj.loadApp("http://facebook.com");
		 
		 
		//Testcase:--> user Registration
		 String Fname="Newuser";
		 String Surname="Webdriver";
		 String email="darshan@gmail.com";
		 String Retypemail="darshan@gmail.com";
		 String pwd="hello1234";
		 obj.User_registration(Fname, Surname, email, Retypemail, pwd);
		 Thread.sleep(5000);
		 
		 //Calling method
		 obj.Messenger_login("User1", "PWD1");
		 obj.driver.close();
			
	}
	
}
