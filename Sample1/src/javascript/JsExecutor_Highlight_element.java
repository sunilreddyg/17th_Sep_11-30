package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor_Highlight_element 
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Identify element
		WebElement text=driver.findElement(By.xpath("//span[contains(.,'Create an account')]"));
		
		//Highlight text using jsexecutor
		js.executeScript("arguments[0].style.backgroundColor = 'yellow'",text);
		
		//Set outline for text
		js.executeScript("arguments[0].style.outline = 'red solid 2px'",text);
		Thread.sleep(5000);
		
		

		
	}

}
