package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete_Editbox_With_Implicit_Timeout 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		//manage timeout until object load at document object model
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.get("https://www.cleartrip.com/");
		//manage timeout until objects load at webpage
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();

		
		

	}

}
