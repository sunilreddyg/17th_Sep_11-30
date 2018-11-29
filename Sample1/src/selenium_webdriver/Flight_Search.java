package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Flight_Search {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		//Identify origin editbox
		driver.findElement(By.id("origin-fsc-search")).clear();
		driver.findElement(By.id("origin-fsc-search")).sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#react-autowhatever-origin-fsc-search--item-0 > section:nth-child(1) > div:nth-child(2) > span:nth-child(1)")).click();
		
		
	
		
		//Identify destination editbox
		driver.findElement(By.id("destination-fsc-search")).clear();
		driver.findElement(By.id("destination-fsc-search")).sendKeys("ORY");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#react-autowhatever-destination-fsc-search--item-0 > section:nth-child(1) > div:nth-child(2) > span:nth-child(1)")).click();
				
		
		//Identify deparute date
		driver.findElement(By.id("depart-fsc-datepicker-input")).click();
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select"))).selectByVisibleText("June 2019");
		Thread.sleep(2000);
		driver.findElement(By.className("bpk-calendar-date--focused-1KUc-")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("depart-fsc-datepicker-input")).clear();
		driver.findElement(By.id("depart-fsc-datepicker-input")).sendKeys("27/06/2019");
		
		
		//Identify class of travel
		driver.findElement(By.id("fsc-class-travellers-trigger-1PZXn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Increase number of adults']")).click();
		
		//click Done button
		driver.findElement(By.xpath("/html/body/div[9]/section/footer/button")).click();
		
		//click flight search
		driver.findElement(By.className("bpk-button-2YQI1")).click();
		
		
		
	}

}
