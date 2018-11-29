package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Javasript_RuntimeChanges {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Select Dropdown
		WebElement Open_account=driver.findElement(By.id("open_account"));
		//Use New Selector to get single option
		new Select(Open_account).selectByVisibleText("Corporate Account");
				
		//Target Webelement
		WebElement Open_my_account_btn=driver.findElement(By.xpath("//input[@value='Open my Account']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",Open_my_account_btn);
		Thread.sleep(10000);
		
		
		

		WebElement Others_editbox=driver.findElement(By.id("FML_USR_ADDRSS_CTY_OTHERS"));
		
		//using javascript executor enable element at runtime...
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].disabled=false",Others_editbox);
		Thread.sleep(5000);
		
		//Type Text into Editbox using javascript
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].value='HYD'",Others_editbox);
		Thread.sleep(5000);
		
		//Hide Element Using javascript
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].style.visibility='hidden'",Others_editbox);
		Thread.sleep(5000);
		
		//Get element to visible using javascript
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].style.visibility='visible'",Others_editbox);
		Thread.sleep(5000);
		
		
		
	}

}
