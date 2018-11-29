package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouse_move {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		
		//click link to download
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/p[3]/a")).click();
		Thread.sleep(4000);

		
		//Create object
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.mouseMove(592, 476);
	}

}
