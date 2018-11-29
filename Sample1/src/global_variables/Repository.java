package global_variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Repository 
{
	public WebDriver driver;
	String browser_name=null;
	String page_url;
	String username;
	String password;
	
	By username_locator=By.id("email");
	By password_locator=By.id("pass");
	By Singin_btn_locator=By.id("loginbutton");
	
	/*
	 * Method:--> Launch diff browsers
	 * Author:-->
	 * CreatedOn:--->
	 */
	
	public void launch_browser()
	{
		if(browser_name=="firefox")
		{
			driver=new FirefoxDriver();
		}
		else if(browser_name=="chrome")
		{
			driver=new ChromeDriver();
		}
	}
	
	
	
	/*
	 * Method:--> Load diff webpages to browser window
	 * Author:-->
	 * CreatedOn:--->
	 */
	
	public void load_webpage()
	{
		driver.get(page_url);
	}
	
	
	/*
	 * Method:--> Userlogin 
	 * Author:-->
	 * CreatedOn:--->
	 */
	public void User_login()
	{
		driver.findElement(username_locator).clear();
		driver.findElement(username_locator).sendKeys(username);
		
		driver.findElement(password_locator).clear();
		driver.findElement(password_locator).sendKeys(password);
		
	}
	
	
	

}
