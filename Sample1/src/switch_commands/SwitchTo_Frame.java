package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame 
{
	
	public static void main(String args[])
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Identify frame at webpage
		WebElement Modal_Frame=driver.findElement(By.id("modal_window"));
		//Switch to frame
		driver.switchTo().frame(Modal_Frame);
		
		//identify email editbox
		WebElement Email_eb=driver.findElement(By.id("email"));
		Email_eb.clear();
		Email_eb.sendKeys("darshan@gmail.com");
		
		
		//IDentify trip id editbox
		WebElement TripID=driver.findElement(By.name("tripid"));
		TripID.clear();
		TripID.sendKeys("65467964");
		
		
		//Switch Control from frame to window
		driver.switchTo().defaultContent();
		
		//Click flights link at homepage
		driver.findElement(By.linkText("Flights")).click();
		
		
		
	}

}
