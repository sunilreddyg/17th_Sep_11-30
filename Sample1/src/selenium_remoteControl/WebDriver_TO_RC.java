package selenium_remoteControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class WebDriver_TO_RC {

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> 
		 * 		=> Remote Control no longer available with selenium 3.x versions
		 * 		=>  rather it does it through emulation and the 
		 * 					WebDriverBackedSelenium interface.
		 * 		=> To use selenium RC in selenium-3 download below executable
		 * 			jar file and configure to selenium-project.
		 * 
		 * 		Download From Maven Repository:-->
		 * 			URL;--> https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-leg-rc
		 * 			select selenium version
		 * 			Download jar file and configure to project
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	
		Selenium rc=new WebDriverBackedSelenium(driver, "https://");
		
		//Type text into editbox using remotecontrol
		rc.type("id=u_0_j", "Newuser");
		rc.type("xpath=//input[@aria-label='Surname']", "webdriver");
		
		//Dropdown Selection
		rc.select("id=day", "10");
		rc.select("id=month", "May");
		rc.select("id=year", "1990");
		
		
		

	}

}
