package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Window {

	public static void main(String[] args) throws Exception
	{

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/wholesale/default.htm");
		driver.manage().window().maximize();
		
		
		//Get Curretn window [mainwindow ] dynamic ID
		String Mainwindow_id=driver.getWindowHandle();
		System.out.println("Mainwindow Dynamic Id is => "+Mainwindow_id);
		
		//Identify Dropdown
		WebElement Dropdown=driver.findElement(By.id("accesspointsselect"));
		Select Select_brach=new Select(Dropdown);
		Select_brach.selectByVisibleText("Demat Centre");
		Thread.sleep(5000);
		
		//Get All window dynamic ID's
		Set<String> allwindows=driver.getWindowHandles();
		
		//Iterate for all windows ID's
		for (String Eachwindow : allwindows) 
		{
			driver.switchTo().window(Eachwindow);
		}
		
		System.out.println("WIndow focused at => "+driver.getTitle());
		
		
		//select dropdown at sub window
		new Select(driver.findElement(By.id("customState"))).selectByIndex(4);
		Thread.sleep(4000);
		
		//Get controls to mainpage
		driver.switchTo().window(Mainwindow_id);
		System.out.println("Current window focused => "+driver.getTitle());
		

	}

}
