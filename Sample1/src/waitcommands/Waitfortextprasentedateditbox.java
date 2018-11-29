package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfortextprasentedateditbox {

	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();

		
	    //target location
		WebElement Mobilenum=driver.findElement(By.xpath("//label[text()='Mobile Number']/preceding-sibling::input"));
		Mobilenum.clear();
		Mobilenum.sendKeys("9666953787");
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//label[text()='Operator']/preceding-sibling::input"),"Idea"));
		System.out.println("Expected input value prasented at edit box");
	}

}
