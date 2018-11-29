package mouse_and_keyboard_interactions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_BY {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.snapdeal.com/products/mobiles-mobile-phones/filters/Form_s~Smartphones?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Target Element
		WebElement Price_Slider=driver.findElement(By.xpath("/html/body/div[10]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
		
		//Enable mosue action on browser
		Actions action=new Actions(driver);
		action.dragAndDropBy(Price_Slider, 100, Price_Slider.getLocation().getX()).build().perform();

		
		
		
	}

}
