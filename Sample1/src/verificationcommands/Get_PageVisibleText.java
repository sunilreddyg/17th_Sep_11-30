package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_PageVisibleText 
{

	public static void main(String[] args) 
	{
		
		//Write program to capture visible text at webpage
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify page
		WebElement Page=driver.findElement(By.tagName("body"));
		String Page_VisibleText=Page.getText();
		System.out.println(Page_VisibleText);
		/*
		 * Note:--> capture selected element and it's child outtertext
		 */
		
		if(Page_VisibleText.contains("Create an account"))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		
		
		
		

	}

}
