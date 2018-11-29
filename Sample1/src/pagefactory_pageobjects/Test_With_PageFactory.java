package pagefactory_pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test_With_PageFactory {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//To call FindBy annotation methods we should create object for pagefactory class.
		Train_tools tools=PageFactory.initElements(driver, Train_tools.class);
		//click External link
		tools.link_pnr_status.click();
		
		//Create object for Keyword class
		KeyWords obj=new KeyWords(driver);
		obj.switchto_window("IRCTC Railway PNR Status");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
