package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Instagram_Signup 
{
	
	@FindBy(how=How.NAME,using="emailOrPhone")
	WebElement email_or_phone_editbox;
	
	@FindBy(name="fullName")
	WebElement fullname_editbox;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement Username_editbox;
	
	@FindBy(css="input[name='password']")
	WebElement Password_editbox;
	
	@FindBy(xpath="//button[text()='Sign up']")
	WebElement Signup_button;
	
	@FindBy(how=How.CLASS_NAME,using="uxKLF")
	WebElement Navigation_footer;
	
	@FindBy(how=How.TAG_NAME,using="a")
	List<WebElement> Navigation_links;
	
	
	
	/*
	 * Method User_ registration
	 */
	public void user_registration(String email,String firstname,String username,String password)
	{
		email_or_phone_editbox.clear();
		email_or_phone_editbox.sendKeys(email);
		
		fullname_editbox.clear();
		fullname_editbox.sendKeys(firstname);
		
		Username_editbox.clear();
		Username_editbox.sendKeys(username);
		
		Password_editbox.clear();
		Password_editbox.sendKeys(password);
	}
	

}
