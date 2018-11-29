package waitcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_WIthout_WebDriverWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		
		boolean flag=ExpectedConditions.titleIs("Selenium - Web Browser Automation").apply(driver);
		System.out.println("title verified status is => "+flag);
	}

}
