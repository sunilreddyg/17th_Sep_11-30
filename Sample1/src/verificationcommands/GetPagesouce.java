package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagesouce 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		String exp_url="https://www.hdfcbank.com/";
		String exp_title="HDFC Bank: Personal Banking Services";
		String exp_text="Insurance";
		String exp_href="href=/nri_banking/home.htm";
		

		//Get Runtime pageSource
		String pageSource=driver.getPageSource();
		
		
		//Expected url and title to be presented
		if(pageSource.contains(exp_title) &&  pageSource.contains(exp_url))
			System.out.println("Expected url and title presented");
		else
			System.out.println("Expected url and title not presented");
		

		
		//Expected text or href presented
		if(pageSource.contains(exp_text)  ||  pageSource.contains(exp_href))
			System.out.println("Expected text and href presented at source");
		else
			System.out.println("expected text or href not presented");
		
	}

}

