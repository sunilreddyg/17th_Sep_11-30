package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_betWeen_Frames {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		//Identify Frame at webpage and switch to frame using name property
		driver.switchTo().frame("packageListFrame");
		//Identify Link under frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();

		
		
		//Get Controls to mainapge
		driver.switchTo().defaultContent();
		//IDentify Frame at wepage and switch to frame using name property
		driver.switchTo().frame("packageFrame");
		
		//Identify link under frame
		driver.findElement(By.linkText("Alert")).click();
		
		
		//Get Controls to mainpage
		driver.switchTo().defaultContent();
		//Switcht to New frame
		driver.switchTo().frame("classFrame");
		
		//Identify link at frame
		driver.findElement(By.linkText("Instance Methods")).click();
		
		
		
		
	}

}
