package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Area_text {

	public static void main(String[] args) 
	{
		
		/*
		 * Testcase:-->
		 * 				Selected Departure city should not visible at
		 * 				arrival city list.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com/");
		driver.manage().window().maximize();
		
		//Click on Departure city
		WebElement Dcity=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		Dcity.click();
		
		//click city option
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		//Identify Arrival List
		WebElement Arrival_list=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTNR"));
		//Get Text on list
		String Cities=Arrival_list.getText();
		
		//Write condition to verify city availability
		if(!Cities.contains("Hyderabad (HYD)"))
			System.out.println("TestPass City not visible at list");
		else
			System.out.println("Test fail city visible list");
		

	}

}
