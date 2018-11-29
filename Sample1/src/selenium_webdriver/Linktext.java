package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//click link using original name
		driver.findElement(By.linkText("About Us")).click();
		
		//click link using original name
		driver.findElement(By.linkText("Jobs")).click();
		
		//click link using original name
		driver.findElement(By.linkText("Job Openings")).click();
		
		
		//click link using partial name
		driver.findElement(By.partialLinkText("Executive – Travel Facilitator (Implant)")).click();
		
		//click link
		driver.findElement(By.partialLinkText("Back to Job openings")).click();
		
		
		

	}

}
