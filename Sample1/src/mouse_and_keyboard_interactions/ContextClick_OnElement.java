package mouse_and_keyboard_interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_OnElement {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify Element
		WebElement Element=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		//Enable mouse and keyboard action at webpage
		Actions action=new Actions(driver);
		//Perform Contextclick option on location
		action.contextClick(Element).perform();
		
		//Identify Location at context menu
		WebElement Delete_option=driver.findElement(By.xpath("/html/body/ul/li[5]/span"));
		Delete_option.click();
		Thread.sleep(5000);
		
		//Close alert window
		driver.switchTo().alert().accept();

	}

}
