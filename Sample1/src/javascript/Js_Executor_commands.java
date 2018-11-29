package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * when to use javascript executor:----->
		 * 
		 * 
		 * Because of cross domain policies browsers enforce your 
		 * script execution may fail unexpectedly and without 
		 * adequate error messaging. mostly happend when trying to access 
		 * another frame. 
		 * 
		 * Note:--> 
		 *  Most times when troubleshooting failure it's 
		 *  best to view the browser's console after 
		 *  executing the WebDriver request.
		 *  
		 *  
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Run javascript on Automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//type text into editbox
		js.executeScript("document.getElementById('u_0_j').value='Arjun'");
		
		//type text into editbox
		js.executeScript("document.getElementById('u_0_l').value='kumar'");
		
		//Identify location using javascript with other locators
		WebElement Email_or_mobile=driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']"));
		js.executeScript("arguments[0].value='Arjunkumar@gmail.com'",Email_or_mobile);
		
		
		//Select Dropdown [using option value property]
		js.executeScript("document.getElementById('day').value='19'");
		js.executeScript("document.getElementById('month').value='6'");  
		js.executeScript("document.getElementById('year').value='1990'");
		
		
		//Select checkbox using javascript
		WebElement Female_radio_button=driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
		js.executeScript("arguments[0].click()",Female_radio_button);
		Thread.sleep(5000);
		
		WebElement male_radio_button=driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		js.executeScript("arguments[0].checked=true",male_radio_button);
	}

}
