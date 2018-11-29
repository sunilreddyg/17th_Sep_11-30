package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssAttribute {

	public static void main(String[] args) throws Exception 
	{
		
			WebDriver driver=new ChromeDriver();
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			
			
			/*
			 * Cssseelctor with attribute:-->
			 * 
			 * target element with other attributes instead of id and name
			 * 
			 * HtmlSource:-->
			 * 		<input id="u_0_j   aria-label="First name">
			 * 
			 * 			Syntax:-->
			 * 					tagname[attributename = 'attributevalue']
			 */
			
			driver.findElement(By.cssSelector("input[aria-label='First name']")).clear();
			driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("Newuser");
			
			/*
			 *	target element with multiple attributes
			 *
			 *			tagname[attributename = 'attributevalue'][attributename='attributevalue']
			 */
			driver.findElement(By.cssSelector("input[aria-label='Surname'][type='text']")).clear();
			driver.findElement(By.cssSelector("input[aria-label='Surname'][type='text']")).sendKeys("Webdriver");
			
			
			/*
			 * Identify Element with cssAttribute when Class property having spaces
			 */
			driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).clear();
			driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).sendKeys("IDentified");
	}

}
