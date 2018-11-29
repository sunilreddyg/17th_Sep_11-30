package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		
		if(Email_eb.isDisplayed() && Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com");
		}
		else
		{
			System.out.println("Element not visible or enabled");
		}
		
		
		
	
		
		/*
		 * ElementNotvisibleException     
		 * InvalidElementstateException
		 */
		
		
		
		//click Next button
		
		
		try {
			
			WebElement Next_btn=driver.findElement(By.xpath("//h10"));
			Next_btn.click();
			
		} catch (NoSuchElementException e) 
		{
			System.out.println(e.getMessage());
			
		} catch (ElementNotVisibleException e) 
		{
			System.out.println(e.getMessage());
		}
		catch (InvalidElementStateException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		

	}

}
