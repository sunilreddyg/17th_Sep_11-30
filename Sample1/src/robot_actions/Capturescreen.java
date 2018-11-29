package robot_actions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturescreen 
{
	public static void main(String[] args) throws AWTException, IOException, InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Robot r = new Robot();
		BufferedImage img = r.createScreenCapture(new Rectangle(size));
		File path = new File("C://screen2.jpg");
		ImageIO.write(img, "JPG", path);
		
		

	}

}
