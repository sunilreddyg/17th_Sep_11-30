package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_picker_Date_selection {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Open Datapicker
		driver.findElement(By.id("dpt_date")).click();
		Thread.sleep(4000);
		
		
		//Iterate for 3 month
		for (int i = 0; i < 3; i++) 
		{
			
			//Identify Current month table
			WebElement Current_month;
			Current_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Find list of clickable links under current month
			List<WebElement> All_links;
			All_links=Current_month.findElements(By.tagName("a"));
			
			//iterate for number of links
			for (int j = 0; j < All_links.size(); j++) 
			{
				
				//Target Each link
				WebElement Eachlink=All_links.get(j);
				Eachlink.click();
				
				//Open Datapicker
				driver.findElement(By.id("dpt_date")).click();
				Thread.sleep(1000);
				
				//Restore all links to avoid staleElement reference exception.
				Current_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				All_links=Current_month.findElements(By.tagName("a"));
				
			}
			
			
			
			
			
			//Click Next button
			WebElement Next_button=driver.findElement(By.xpath("//*[@id='cal_showNextMonth']"));
			Next_button.click();
			Thread.sleep(2000);
		}

	}

}
