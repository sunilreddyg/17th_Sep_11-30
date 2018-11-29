package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Options_Count 
{

	public static void main(String[] args) 
	{
		/*
		 * Verify Dropdown option Count
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/mobile/Credit-Card_TU.aspx");
		driver.manage().window().maximize();
		
		Select Selector=new Select(driver.findElement(By.id("ddlCity")));
		int Count=Selector.getOptions().size();
		System.out.println("Dropdown option contains => "+Count);
		
		
		
	}

}
