package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Sendkeys:--> Command allow characters sequence and keyboard
		 * 				shortcuts.
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Firstname editbox
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Arjun",Keys.TAB,"Vijay");
		
		
		//Select Dropdown option using keyboard shortcuts
		driver.findElement(By.id("day")).sendKeys("16");
		
		//Identify month  dropdown
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		Thread.sleep(5000);
		
		driver.findElement(By.id("month")).sendKeys("jan");
		
		
		/*
		 * Note:--> For keyboard shortcuts webdriver not going to throw any
		 * 			exception..
		 */
		
		
	}

}
