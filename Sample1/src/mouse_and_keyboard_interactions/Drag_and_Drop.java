package mouse_and_keyboard_interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify Demo Frame
		WebElement Demo_Frame=driver.findElement(By.className("demo-frame"));
		//switch to Demo Frame
		driver.switchTo().frame(Demo_Frame);
		
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Enable mosue and keyboard action on webpage
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dst).perform();
		
		
		
		

		/*
		 * 	drag and drop using mouse commands
		 * 
		 * 	action.clickAndHold(Src).moveToElement(dst).release(Src).perform();
		 */
		
		
	}

}
