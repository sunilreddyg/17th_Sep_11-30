package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown_Selection {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		//Create object for webdrivewait
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		//Select Dropdown
		WebElement Open_account=driver.findElement(By.id("open_account"));
		//Use New Selector to get single option
		new Select(Open_account).selectByVisibleText("Corporate Account");
				
		//Target Webelement
		WebElement Open_my_account_btn=wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@value='Open my Account']")));
		Open_my_account_btn.click();
				
				
		Thread.sleep(5000);
		
		
		//Identify dropdown
		WebElement City=driver.findElement(By.id("FML_USR_ADDRSS_CTY_DROP"));
				
		//Find list of Option tags under select element
		List<WebElement> AllOptions=City.findElements(By.tagName("option"));
		
		//Get count of options
		int Option_count=AllOptions.size();
		System.out.println("List of options available => "+Option_count);
		
		
		//Iterate for expected option count
		for (int i = 0; i < 100; i++) 
		{
			
			//Target Each Option from List
			WebElement Eachoption=AllOptions.get(i);
			String City_name=Eachoption.getText();
			
			//click Each option
			Eachoption.click();
			
			//Identify Location of state editbox
			WebElement State_editbox=driver.findElement(By.id("FML_USR_ADDRSS_STTE_DIS"));
			//Capture input from editbox
			String State_Name=State_editbox.getAttribute("value");
			
			System.out.println(City_name.trim()+"       "+State_Name.trim());
			
		}

	}

}
