package navigate_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_class {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
	    driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//By Using DOT method
		driver.findElement(By.xpath("//a[contains(.,'Forgotten account?')]")).click();
		
		//Backward
		driver.navigate().back();
		//Forword
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
		

	}

}
