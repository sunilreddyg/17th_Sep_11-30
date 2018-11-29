package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_With_Sendkeys {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/mobile/Credit-Card_TU.aspx");
		driver.manage().window().maximize();
		
		
		//Identify location
		driver.findElement(By.id("ddlCity")).sendKeys("123");
		System.out.println("Option selected with sendkeys");
		
		/*
		 * Sendkeys ignore exception on invalid option
		 */
		
		
		Thread.sleep(5000);
		
		//Select OPtion using original syntax
		new Select(driver.findElement(By.id("ddlCity"))).selectByVisibleText("123");
		System.out.println("option selected with select class");
		
		/*
		 * select class throw exception on invalid class
		 */
	}

}
