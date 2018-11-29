package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_RuntimeCommands 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		
		js.executeScript("return alert('Page title captured')");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		String pageurl=js.executeScript("return window.location.href").toString();
		System.out.println(pageurl);
		
		
		
		js.executeScript("return alert('Page url captured')");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
