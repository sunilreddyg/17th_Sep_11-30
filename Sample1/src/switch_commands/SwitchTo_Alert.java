package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

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
		
		//Switch to alert
		Alert alert=driver.switchTo().alert();
		//Get text on alert window
		String Alert_text=alert.getText();
		System.out.println("Alert text Presented => "+Alert_text);
		
		//Close alert window
		alert.accept();
		
		
		
		/*
		 * Switch to alert and Capture text 
		 * 		
		 * 		driver.switchTo().alert().gettext();
		 * 
		 * Switch to alert and accept popup window [It close Alert]
		 * 
		 * 		driver.switchTo().alert().accept();
		 * 
		 * Switch to alert and dismiss popup window [it close alert]
		 * 
		 * 		driver.switchTo().alert().dismiss();
		 * 
		 * switch to alert and send characters into editbox
		 * 
		 * 		driver.switchTo().alert().sendkeys("text");
		 */
		
		
		((JavascriptExecutor)driver)
		.executeScript("return prompt('Enter mobilenumber')");
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("9030248855");
		
		
		
	}

}
