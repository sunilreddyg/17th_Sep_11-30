package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Wait_For_title 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		//Create object for Webdriverwait
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.titleIs("Selenium - Web Browser Automation"));
		System.out.println("SeleniumHQ homepage title verified");
		
		//Click link
		driver.findElement(By.linkText("Projects")).click();
		
		//Wait timeout until page title verified
		boolean flag=wait.until(ExpectedConditions.titleContains("Projects"));
		System.out.println("Project page Verified");
		
		if(flag==true)
		{
			//click link
			driver.findElement(By.linkText("Selenium Grid")).click();
		}
		

	}

}
