package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown_Selection
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		//IDentify Location with Select Class
		boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag);
		
		//using javascript convert Dropdown to multiple selection
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(4000);
		
		//IDentify location with select class
		boolean flag1=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag1);
		
		//Write condition statement
		if(flag1==true)
		{
			//select Multiple option under dropdown
			Select Selector=new Select(driver.findElement(By.id("open_account")));
			Selector.deselectAll();
			Selector.selectByVisibleText("NRI Account");
			Selector.selectByVisibleText("Corporate Account");
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		

	}

}
