package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetCsvalue {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//identify location 
		WebElement OnewayTab=driver.findElement(By.xpath("//label[text()='one way']"));

		String Element_color=OnewayTab.getCssValue("color");
		String Elemnet_bgcolor=OnewayTab.getCssValue("background-color");
		String Element_font_size=OnewayTab.getCssValue("font-size");
		String element_text_Align=OnewayTab.getCssValue("text-align");
		
		System.out.println("Color displayed => "+Element_color);
		System.out.println("background-color displayed => "+Elemnet_bgcolor);
		System.out.println("Element font size availabel => "+Element_font_size);
		System.out.println("Element text aligned  => "+element_text_Align);
		
		
		/*
		 * Webdriver get background color and color in RBGA format.
		 * To convert hex format to rgba format follow below website
		 * 
		 * 			http://hex2rgba.devoth.com/
		 */
		
		String Exp_color="rgba(22, 72, 128, 1)";
		if(Element_color.equals("Element_color"))
			System.out.println("Color matching");
		else
			System.out.println("Color mismatch");
		
	}

}
