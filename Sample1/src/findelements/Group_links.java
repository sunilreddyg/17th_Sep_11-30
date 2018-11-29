package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Identify location
		WebElement Navigation_footer;
		Navigation_footer=driver.findElement(By.className("uxKLF"));
		
		//Findout number of links available
		List<WebElement> All_links;
		All_links=Navigation_footer.findElements(By.tagName("a"));
		
		//Iterate for all links
		for (int i = 0; i < All_links.size(); i++) 
		{
			//Target Each link
			WebElement Eachlink=All_links.get(i);
			//Get Each linkname
			String Linkname=Eachlink.getText();
			
			//Click Each link
			Eachlink.click();
			Thread.sleep(3000);
			
			//Navigate to back
			driver.navigate().back();
			Thread.sleep(3000);
			
			//Restore Identificaion and links
			Navigation_footer=driver.findElement(By.className("uxKLF"));
			All_links=Navigation_footer.findElements(By.tagName("a"));
		}
		
	}

}
