package mouse_and_keyboard_interactions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement Products_menu=driver.findElement(By.linkText("Products"));
		
		//Create object for MouseInteractions
		Actions action=new Actions(driver);
		//Perfrom hover action on location.
		action.moveToElement(Products_menu).build().perform();
		
		//Perform mouse hover action on sub menu
		WebElement Cards_submenu=driver.findElement(By.linkText("Cards"));
		action.moveToElement(Cards_submenu).build().perform();
		
		
		//click link using action class
		WebElement Credit_Cards_option=driver.findElement(By.linkText("Credit Cards"));
		action.click(Credit_Cards_option).click().perform();
		
		
	}

}
