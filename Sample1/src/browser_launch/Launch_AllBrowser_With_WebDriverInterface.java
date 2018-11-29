package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_AllBrowser_With_WebDriverInterface {

	public static void main(String[] args)
	{
		
		/*
		 * WebDriver is common interface class It contains set of
		 * method to manipulate browser automation.
		 * 	
		 * 		=> Webdriver is designed to run all browser instances.
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	
		
		//Identify location
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		
		//identify password
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		
		//Identify login button
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
