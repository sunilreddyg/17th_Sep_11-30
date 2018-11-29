package method_parameters;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository
{
	
	
	public WebDriver driver=null;
	public WebDriverWait wait=null;
	

	/*
	 * Methodname :--> launch diff browsers
	 * Author
	 * Createdon
	 * ReviewedBy
	 * Local parameters used
	 */
	public void launch_browser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
		    driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;

		default:System.out.println("browser mismatch");
			break;
		}
		
	}
	
	
	/*
	 * Keywordname:--> load diff application url
	 * Author:-->
	 * lastupdatedate:-->
	 * createdon:-->
	 * reviewedby:-->
	 * parametersused:---> Local parameters
	 */
	public void loadApp(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	

	
	/*
	 * Keywordname:--> manage explicit and implicit timeout
	 * Author:-->
	 * lastupdatedate:-->
	 * createdon:-->
	 * reviewedby:-->
	 * parametersused:---> Local parameters
	 */
	public void setTimeout(int timeout_in_seconds)
	{
		driver.manage().timeouts().implicitlyWait(timeout_in_seconds, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, timeout_in_seconds);
	}
	
	
	/*
	 * Keywordname:--> Enter text into Editbox [Only with xpath]
	 * Author:-->
	 * lastupdatedate:-->
	 * createdon:-->
	 * reviewedby:-->
	 * parametersused:---> Local parameters
	 */
	public void Enter_textTo_eb(String element_xpath, String input)
	{
		WebElement Editbox=driver.findElement(By.xpath(element_xpath));
		Editbox.clear();
		Editbox.sendKeys(input);
	}
	
	
	/*
	 * Keywordname:--> Enter text into Editbox [With By class]
	 * Author:-->
	 * lastupdatedate:-->
	 * createdon:-->
	 * reviewedby:-->
	 * parametersused:---> Local parameters
	 */
	public void Enter_textTo_eb(By locator,String input)
	{
		WebElement Editbox=driver.findElement(locator);
		if(Editbox.isDisplayed() && Editbox.isEnabled())
		{
			Editbox.clear();
			Editbox.sendKeys(input);
		}
	}
	
	
	/*
	 * MethodName:--> Select Dropdown using optioname
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Select_dropdown(By locator, String Option_name)
	{
		WebElement Dropdown=driver.findElement(locator);
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
	public void Click_element(By locator)
	{
		driver.findElement(locator).click();
	}
	
	
	/*
	 * MethodName:--> waitandclick [Radiobutton, checkbox,link,button,list,image...etc]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Wait_and_click(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	
	/*
	 * MethodName:--> waitforElementto visisble
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void wait_for_Element_visible(By locator)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	

	/*
	 * MethodName:-->Mouse hover on element
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void MouseHover(By locator)
	{
		WebElement Element=driver.findElement(locator);
		new Actions(driver).moveToElement(Element).build().perform();
	}
	
	/*
	 * MethodName:-->ContextClick
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void RightClick_OnElement(By locator)
	{
		WebElement Element=driver.findElement(locator);
		new Actions(driver).contextClick(Element).perform();
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
	
	
	/*
	 * MethodName:-->Capture Screenshot
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Capturescreen(String Imagename) 
	{
		//Java time stamp..
		DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Get System Data
		Date d=new Date();   //import java.util;
		//Using simple formatter change system data..
		String time=df.format(d);
		
		System.out.println(d.toString());
		
		
		try {
			
			File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1, new File("screens\\"+time+Imagename+".png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
