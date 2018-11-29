package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeCss {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("div[id='minsal_dd_cja'] > div > input")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("div[id='minsal_dd_cja'] > div:nth-child(2) > div > div > div > ul > li:nth-child(7)")).click();
		

	}

}
