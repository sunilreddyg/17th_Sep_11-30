package mouse_and_keyboard_interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_on_Element {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify Element
		WebElement Element=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
				
		//Enable mouse and keyboard action at webpage
		Actions action=new Actions(driver);
		//Perform Contextclick option on location
		action.contextClick(Element).perform();
		Thread.sleep(5000);
		//Build new action to use keyboard shortcuts
		action.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).perform();
		
		
		

	}

}
