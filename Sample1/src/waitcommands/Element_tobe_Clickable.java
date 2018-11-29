package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element_tobe_Clickable 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		//Create object for Webdriverwait
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable
				(By.linkText("Projects"))).click();
		System.out.println("timeout released link clicked successfull");

	}

}
