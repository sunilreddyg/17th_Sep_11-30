package verificationcommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_PageTitle {

	public static void main(String[] args) 
	{
		
		//launch browser and load seleniumhq website
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		//Verify Expected title presented at Selenium homepage
		String Exp_title="Selenium - Web Browser Automation";
		
		//Capture runtime title
		String Runtime_title=driver.getTitle();
		
		//Verify Runtime title equals with expected title.
		boolean flag=Runtime_title.equals(Exp_title);
		System.out.println("Selenium Homepage title status is => "+flag);
		
		//Write decision statemenet to execute block of code.
		if(flag==true)
		{
			System.out.println("expected title presented for selenium page");
					
			
					//click projects link only when expected page displayed
					driver.findElement(By.linkText("Projects")).click();
					
					//write nested if condition to verify title presented
					if(driver.getTitle().equals("Selenium Projects"))
					{
						System.out.println("Project page displayed");
					}
					else
					{
						System.err.println("Wrong title display for projects page");
					}
		}
		else
		{
			System.err.println("Expected title not presented for selenium homepage");
		}
		
		
		
		
	}

}
