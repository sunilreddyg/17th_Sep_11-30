package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Alert 
{

	public static void main(String[] args) 
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
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert presented at webpage");
		
		//Switch to alert
		Alert alert=driver.switchTo().alert();
		//Get text on alert window
		String Alert_text=alert.getText();
		System.out.println("Alert text Presented => "+Alert_text);
		
		//Close alert window
		alert.accept();
		

	}

}
