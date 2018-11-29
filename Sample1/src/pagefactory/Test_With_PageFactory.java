package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test_With_PageFactory {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		//To call FindBy annotation methods we should create object for pagefactory class.
		
		Instagram_Signup Signup=PageFactory.initElements(driver, Instagram_Signup.class);
		String email="darshan@gmail.com";
		String firstname="newuser";
		String username="Webdriver";
		String password="hello1234";
		Signup.user_registration(email, firstname, username, password);
		
		
		Instagram_Homepage_navigation_links nav_links=PageFactory.initElements(driver, Instagram_Homepage_navigation_links.class);;
		nav_links.Navigation_link_AboutUS.click();
	}

}
