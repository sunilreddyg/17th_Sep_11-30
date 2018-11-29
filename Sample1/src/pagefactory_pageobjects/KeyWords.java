package pagefactory_pageobjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class KeyWords 
{
	
	public WebDriver driver;
	
	
	public KeyWords(WebDriver driver) 
	{
		this.driver=driver;
	}


	
	/*
	 * MethodName:--> Enter text into Editbox..using locator class
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Enter_textTo_Eb(WebElement element, String Input)
	{
		WebElement Editbox=element;
		
		if(Editbox.isDisplayed() && Editbox.isEnabled())
		{
			Editbox.clear();
			Editbox.sendKeys(Input);
		}
		else
			System.out.println("Element Not visible or enabled");
	}
	

	/*
	 * MethodName:--> Select Dropdown using optionname
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Select_dropdown(WebElement element, String Option_name)
	{
		WebElement Dropdown=element;
		if(Dropdown.isDisplayed() && Dropdown.isEnabled())
		{
			new Select(Dropdown).selectByVisibleText(Option_name);
		}
		else
			System.out.println("Dropdown element not visible or enabeld");
	}
	
	

	/*
	 * MethodName:--> Click Element [Radiobutton, checkbox,link,button,list,image...etc]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Click_element(WebElement element)
	{
		element.click();
	}
	
	
	/*
	 * MethodName:-->switch to window using window title
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void switchto_window(String win_title)
	{
		//Get all window dyamic id's
		Set<String> allwindows=driver.getWindowHandles();
				
		//Apply foreach loop ot iterate 
		for (String Eachwindow : allwindows) 
		{
			driver.switchTo().window(Eachwindow);
			//Get Current window at runtime
			String pagetitle=driver.getTitle();
					
			if(pagetitle.contains(win_title))
			{
				break;
			}
				
		}
	}

}
