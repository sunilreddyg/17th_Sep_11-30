package verificationcommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_commands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		String Runtime_title=driver.getTitle();
		System.out.println("pagetitle is => "+Runtime_title);
		
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Page url is => "+Runtime_url);
		
		
		
	}

}
