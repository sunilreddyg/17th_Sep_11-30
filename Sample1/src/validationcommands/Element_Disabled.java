package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Disabled {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:--> Verify booking can't allow morethan 90 Days
		 * Expected:--> After 90 Days next button should be disabled
		 */
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Identify Elemnt
		WebElement Cal=driver.findElement(By.className("cal_openLink"));
		Cal.click();
		Thread.sleep(3000);
		
		
		//Target Nextmonth Button
		WebElement Next_month_btn=driver.findElement(By.id("cal_showNextMonth"));
		Next_month_btn.click();
		Thread.sleep(2000);
		
		Next_month_btn.click();
		Thread.sleep(2000);
		
		Next_month_btn.click();
		Thread.sleep(2000);
		
		//Verify Next button should be disabled
		String Runtime_class=Next_month_btn.getAttribute("class");
		
		if(Runtime_class.contains("disabled"))
			System.out.println("Testpass :--> Element disabled");
		else
			System.out.println("Testfail :--> Element enabled");
		
	}

}
