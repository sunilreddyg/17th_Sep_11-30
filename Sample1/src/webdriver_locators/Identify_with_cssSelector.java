package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_with_cssSelector {

	public static void main(String[] args) throws Exception 
	{
		//launch Firefox Browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
				
				
		/*
		 * Target Element Using CssSelector when Unique property available ID
		 * 	
		 * 		Htmlsource:--->	
		 * 			<input id="u_0_j"  type="text">		
		 * Locator:--->
		 * 					#id  [During cssSelector use # tag before id]
		 */
		driver.findElement(By.cssSelector("#u_0_j")).clear();
		driver.findElement(By.cssSelector("#u_0_j")).sendKeys("WithID");
		Thread.sleep(5000);
		
				
		/*
		 * Target Element Using CssSelector by using combination id and class
		 * 
		 * Htmlsource:--->	
		 * 			<input id="u_0_j"  class="inputtext">	
		 * 	Locator:--->
		 * 					#id.classname
		 */
		driver.findElement(By.cssSelector("#u_0_j.inputtext")).clear();
		driver.findElement(By.cssSelector("#u_0_j.inputtext")).sendKeys("Id-and_class");
		Thread.sleep(5000);
		
		
		
		/*
		 * Target Element Using CssSelector by using combination [id,class,tagname]
		 * Htmlsource:---->
		 * 		<input id="u_0_j"  class="inputtext">
		 * 	Locator:--->
		 * 					tagname#id.classname
		 */
		driver.findElement(By.cssSelector("input#u_0_j.inputtext")).clear();
		driver.findElement(By.cssSelector("input#u_0_j.inputtext")).sendKeys("tag,id,class");
		Thread.sleep(5000);
		
		/*
		 * Target Element Using CssSelector when class property having space
		 * Html source:--->
		 * 			<input class="inputtext  _58mg_  5dba  _2ph-">
		 * 
		 * 	Locator:--->
		 * 					Space cover with <----  .  ----> operator
		 * 		Note:-->
		 * 			using cssSelector we can define group of class properties 
		 * 			with in element
		 * 		
		 */
		
		driver.findElement(By.cssSelector(".inputtext._58mg._5dba._2ph-")).clear();
		driver.findElement(By.cssSelector(".inputtext._58mg._5dba._2ph-")).sendKeys("Class with space");

	}

}
