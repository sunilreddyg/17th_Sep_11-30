package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository {

	public static void main(String[] args) 
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.loadApp("http://facebook.com");
		obj.setTimeout(30);
		
		
		//Using keyword enter text into editbox
		obj.Enter_textTo_eb("//input[@id='email']", "9030248855");
		obj.Enter_textTo_eb("//input[@id='pass']", "Hello12345");
		
		
		//Enter Text into Editbox using 
		obj.Enter_textTo_eb(By.id("u_0_j"), "Newuser");
		obj.Enter_textTo_eb(By.id("u_0_l"), "webdriver");
		
		
		//Select Dropdown
		obj.Select_dropdown(By.id("day"), "23");
		obj.Select_dropdown(By.id("month"), "Nov");
		obj.Select_dropdown(By.id("year"), "1990");
		
		//Select female radio button
		obj.Click_element(By.cssSelector("input[type='radio'][value='1']"));
		
	}

}
