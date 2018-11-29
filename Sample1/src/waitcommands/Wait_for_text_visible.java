package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_text_visible {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		//Enable Explicit wait on Automation browser
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.findElement(By.id("SearchBtn")).click();
		String exp_text="Sorry, but we can't continue until you fix everything that's marked in RED";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("homeErrorMessage"),exp_text));
		System.out.println("text presented on location");


		
		

	}

}
