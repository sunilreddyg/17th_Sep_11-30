package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) 
	{
	
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.domainname.in");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		//Target WebElement 
		WebElement Element=driver.findElement(By.id("XYZ"));
		
		//Click on WebElement
		action.click(Element).perform();
		
		//Double click on WebElement
		action.doubleClick(Element).perform();

		//Right click on webElement
		action.contextClick(Element).perform();
		
		//Move to WebElement
		action.moveToElement(Element).perform();
		
		//Click and Hold on WebElement
		action.clickAndHold(Element).perform();
		
		//Relase cursor on webElement
		action.release(Element).perform();
		
		WebElement src=driver.findElement(By.id("x"));
		WebElement dst=driver.findElement(By.id("y"));
		//drag and drop
		action.dragAndDrop(src, dst).perform();
		//Drag and drop by
		action.dragAndDropBy(src, 100, 200).perform();
		
		//Drag and drop action using mouse commands
		action.clickAndHold(src).moveToElement(dst).release(src).build().perform();
		
		
		//Keyboard Actions
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Element, Keys.TAB).perform();
		action.keyDown(Keys.CONTROL).perform();
		action.keyUp(Keys.CONTROL).perform();
		
		
		
		
		
	}

}
