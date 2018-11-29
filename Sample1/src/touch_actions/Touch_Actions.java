package touch_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.interactions.internal.Coordinates;

public class Touch_Actions {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		
		//Enable touch actions on automation browser
		TouchScreen touch=((HasTouchScreen)driver).getTouch();
		
		//Identify location at Webpage
		WebElement Element=driver.findElement(By.id("XYZ"));
		//Get Element Coordinates
		Coordinates ele_coordinates=((Locatable)driver).getCoordinates();
		
		//Click Single tap at element
		touch.singleTap(ele_coordinates);
		
		//Double tab at element
		touch.doubleTap(ele_coordinates);
		
		//Longpress on element
		touch.longPress(ele_coordinates);
		
		//Scrol to element
		touch.scroll(ele_coordinates, 100, 200);
		
		//flick to view screen
		touch.flick(0, 1);
	}

}
