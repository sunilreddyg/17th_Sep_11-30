package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertHandling 
{

	public static void main(String[] args) throws Exception
	{
		/*
		 * Testcase:--> Verify Search functionality with invalid
		 * 				or without enter data.
		 * 
		 * Expected:-->
		 * 			   System Display popup window..
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		//Identify search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Verify alert presented webpage
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			//Switch to alert
			Alert alert=driver.switchTo().alert();
			//Get text on alert window
			String Alert_text=alert.getText();
			System.out.println("Alert text Presented => "+Alert_text);
			
			//Close alert window
			alert.accept();
		}
		
		
		
		
		

	}

}
