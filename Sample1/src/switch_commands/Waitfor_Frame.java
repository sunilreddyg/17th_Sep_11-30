package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_Frame {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
		
		//click Signin button
		driver.findElement(By.xpath("//button[@class='login-btn']")).click();

		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("modalIframe")));
		System.out.println("timeout released switch to frame");
		
		//Wait for element visible
		WebElement Mobile_number=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mobileNoInp")));
		Mobile_number.clear();
		Mobile_number.sendKeys("9030248855");
		
		
		
		
	}

}
