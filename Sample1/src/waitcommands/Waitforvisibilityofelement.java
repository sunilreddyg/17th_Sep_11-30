package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforvisibilityofelement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		//Enable Explicit wait on Automation browser
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//Identiiy Multicity Location
		//driver.findElement(By.xpath("//label[text()='multi-city']")).click();

		//Manage time out until element visible at webpage
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addModifyBtn")));
		System.out.println("Add city button is visible at webpage");
		
	}

}
