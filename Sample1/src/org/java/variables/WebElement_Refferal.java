package org.java.variables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Refferal 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Firstname editbox
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Arjun");
				
		//Identify Surname
		WebElement Lastname_editbox=driver.findElement(By.name("lastname"));
		Lastname_editbox.clear();
		Lastname_editbox.sendKeys("Vijay");
	
		
		//Identify username and mobile
		By Mobile_locator=By.name("reg_email__");
		WebElement Email_or_mobile_editbox=driver.findElement(Mobile_locator);
		Email_or_mobile_editbox.clear();
		Email_or_mobile_editbox.sendKeys("arjunv1@gmail.com");
		
		
		
		
		
	}

}
