package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Instagram_Homepage_navigation_links 
{
	
	
	@FindBy(how=How.LINK_TEXT,using="About us")
	WebElement Navigation_link_AboutUS;
	
	@FindBy(how=How.LINK_TEXT,using="Support")
	WebElement Navigation_link_Support;
	
	
	@FindBy(how=How.LINK_TEXT,using="Press")
	WebElement Navigation_link_Press;

}
