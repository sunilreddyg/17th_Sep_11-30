package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {

	public static void main(String[] args) 
	{

		/*
		 * In ICICI dialy shares web application verify Nifty tab
		 * active on browser launch.  
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//Identify Nifty Tab
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		
		//Get Runtime property of Nifty
		String Runtime_class=Nifty_tab.getAttribute("class");
		
		if(Runtime_class.contains("tab-active"))
			System.out.println("As expected Nifty selected");
		else
			System.out.println("Nifty tab is deactive");
		
		
		

	}

}
