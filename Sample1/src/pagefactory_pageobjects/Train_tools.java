package pagefactory_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Train_tools 
{
	
	@FindBy(xpath="//a[@title='Check PNR Status']")
	WebElement link_pnr_status;
	
	@FindBy(xpath="//a[@title='Trains availability calendar']")
	WebElement link_train_calendar;
	
	@FindBy(xpath="//a[@title='Cancel trains tickets']")
	WebElement link_cancel_train_tickets;
	
	@FindBy(xpath="//a[@title='Rail Tour Packages']")
	WebElement link_Rail_packages;
	


}
