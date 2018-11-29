package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Element_With_Class_Attribute 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		//Click elemetn using class locator
		driver.findElement(By.className("linkButtonSigninHeader")).click();
		
		
		//identify location using class property
		driver.findElement(By.className("noRightBorder")).clear();
		driver.findElement(By.className("noRightBorder")).sendKeys("newuser123498");
		
		//click Next button
		driver.findElement(By.id("iSignupAction")).click();

	}

}
