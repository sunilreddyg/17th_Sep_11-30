package selenium_inher;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
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
	
	//Declare Webdriver as global variable
	public WebDriver driver;
	public WebDriverWait wait;
	/*
	 * Methodname;-->   Launch Diff browsers  [firefox, IE, chrome]
	 * Author:---->
	 * CreatedOn:--->
	 * Reviewed By:-->
	 * parameters used:--->
	 * Last updated date:---> Local parameter
	 */
	public void BrowserLaunch(String brname)
	{
		switch (brname) 
		{
		
		case "firefox":
			driver=new FirefoxDriver();
			break;

		case "ie":
			driver=new InternetExplorerDriver();
			break;
			
		case "chrome":
			driver=new ChromeDriver();
			break;
		default:
			break;
		}
	}
	
	
	
	/*
	 * Methodname;-->  Load webapplication  [Any url with https://]
	 * Author:---->
	 * CreatedOn:--->
	 * Reviewed By:-->
	 * parameters used:--->
	 * Last updated date:---> Local parameter
	 */
	public void loadApp(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	

	/*
	 * Methodname;-->  Set Timeout Load in Seconds
	 * Author:---->
	 * CreatedOn:--->
	 * Reviewed By:-->
	 * parameters used:--->
	 * Last updated date:---> Local parameter
	 */
	public void SetTime(int Seconds)
	{
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
		
		//Explicit
		wait=new WebDriverWait(driver, Seconds);
	}
	
	
	/*
	 * Methodname;-->  Enter text into Editbox
	 * Author:---->
	 * CreatedOn:--->
	 * Reviewed By:-->
	 * parameters used:--->
	 * Last updated date:---> Local parameter
	 */
	public void Enter_texto_toEb(By locator, String input)
	{
		WebElement Editbox=driver.findElement(locator);
		if(Editbox.isDisplayed() && Editbox.isEnabled())
		{
			Editbox.clear();
			Editbox.sendKeys(input);
		}
		else
			System.out.println("Editbox not visible or enabled");
		
		
	}
	
	
	/*
	 * Methodname;-->  Select Dropdown options using [Option name]
	 * Author:---->
	 * CreatedOn:--->
	 * Reviewed By:-->
	 * parameters used:--->
	 * Last updated date:---> Local parameter
	 */
	public void Select_Dropdown_option(By locator, String Optionname)
	{
		WebElement Dropdown=driver.findElement(locator);
		new Select(Dropdown).selectByVisibleText(Optionname);
	}
	
	
	
	/*
	 * Methodname;-->  Click Any Element
	 * Author:---->
	 * CreatedOn:--->
	 * Reviewed By:-->
	 * parameters used:--->
	 * Last updated date:---> Local parameter
	 */
	public void Click_Element(By locator)
	{
		WebElement Element=driver.findElement(locator);
		Element.click();
	}
	
	
	/*
	 * Methodname;-->  Click Any Element
	 * Author:---->
	 * CreatedOn:--->
	 * Reviewed By:-->
	 * parameters used:--->
	 * Last updated date:---> Local parameter
	 */
	public void Wait_And_Click_Element(By locator)
	{
		wait.until(ExpectedConditions
				.elementToBeClickable(locator)).click();
	}
	
	
	
	/*
	 * Methodname;-->  Mosue-Hover on Element
	 * Author:---->
	 * CreatedOn:--->
	 * Reviewed By:-->
	 * parameters used:--->
	 * Last updated date:---> Local parameter
	 */
	public void Mouse_Hover_onElement(By locator)
	{
		WebElement Element=driver.findElement(locator);
		
		Actions action=new Actions(driver);
		action.moveToElement(Element).perform();
	}
	
	
	/*
	 * MethodName:--->Switch to window using Title name
	 * Author:--->
	 * CreatedOn:--->
	 * ReviewedBy:--->
	 * Last UpdatedDate:--->
	 * ParametersUsed:--->Local parameters
	 */
	public void switchTo_window(String win_title)
	{
		Set<String> allwindows=driver.getWindowHandles();
		for (String eachwindow : allwindows) 
		{
			driver.switchTo().window(eachwindow);
			String RuntimeTitle=driver.getTitle();
			if(RuntimeTitle.contains(win_title))
			{
				break;
			}
		}
	}
	
	/*
	 * MethodName:--->Capture Screenshot
	 * Author:--->
	 * CreatedOn:--->
	 * ReviewedBy:--->
	 * Last UpdatedDate:--->
	 * ParametersUsed:--->Local parameters
	 */
	public void CaputeScreen(String filename)
	{
		
		try {
			
		
			//Java timestamp
			DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/hh/mm-ss");
			//Capture current system date
			Date d=new Date();
			//Using dateformatter convert date
			String time=df.format(d);
			
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\"+time+filename+".png"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	//-----------------------UI validation commands-------------------
	
	
	/*
	 * MethodName:--->Method Verify title presented at webpage and return true/false
	 * Author:--->
	 * CreatedOn:--->
	 * ReviewedBy:--->
	 * Last UpdatedDate:--->
	 * ParametersUsed:--->Local parameters
	 */
	public boolean isTitlePresented(String Exptitle)
	{
		//Get Runtime page title
		String Runtime_title=driver.getTitle();
		//Verify Runtime title contains expected title
		boolean flag=Runtime_title.contains(Exptitle);
		
		return flag;
	}
	
	
	/*
	 * MethodName:--->Method Verify URl presented at webpage and return true/false
	 * Author:--->
	 * CreatedOn:--->
	 * ReviewedBy:--->
	 * Last UpdatedDate:--->
	 * ParametersUsed:--->Local parameters
	 */
	public boolean isUrlPresented(String Expurl)
	{
		//Get Runtime url
		String Runtime_url=driver.getCurrentUrl();
		//Verify Expected url contains at Runtime url
		boolean flag=Runtime_url.contains(Expurl);
		
		return flag;
	}
	
	
	/*
	 * MethodName:--->Method Verify Title,Url,Element,text presented at source
	 * Author:--->
	 * CreatedOn:--->
	 * ReviewedBy:--->
	 * Last UpdatedDate:--->
	 * ParametersUsed:--->Local parameters
	 */
	public boolean isElement_presentedAt_Source(String title_url_text_elementsource)
	{
		//Capture PageSource
		String Runtime_Source=driver.getPageSource();
		boolean flag=Runtime_Source.contains(title_url_text_elementsource);
		return flag;
	}
	
	
	 /*
	  * Methodname:--> verify text visible at selected Element or Area
	  * Author
     * CreatedOn
     * Reviewed By
     * parameters used;---> local parameter
     * last update date:--->
     * 
     * Note;-->
     * 		Can verify Errormsg,Status msg, Info msg, headers, text
     * 
	  */
	 public boolean is_text_visible_AtElement(By locator,String exp_text)
	 {
		 //Get page visible text
		 String page_text=driver.findElement(locator).getText();
		 boolean flag=page_text.contains(exp_text);
		 return flag;
	 }
	
	
	
	 
		/*
		 * Methodname:--> verify text visible at page..
		 * Author
	     * CreatedOn
	     * Reviewed By
	     * parameters used;---> local parameter
	     * last update date:--->
	     * 
	     * Note;-->
	     * 		Can verify Errormsg,Status msg, Info msg, headers, text
	     * 
		 */
		 public boolean is_text_visible_atpage(String Exp_text)
		 {
			 //Get page visible text
			 String page_text=driver.findElement(By.tagName("body")).getText();
			 boolean flag=page_text.contains(Exp_text);
			 return flag;
		 }
		 
		 
		 
		 /*
		  * Methodname:--> Verify Alert presented at webpage
		  * Author
		  * CreatedOn
		  * Reviewed By
		  * parameters used;---> local parameter
		  * last update date:--->
		  * 
		  */
		  public boolean isAlertPresented()
		  {
			  if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
			  {
				  return true;
			  }
			  else
				 return false;
		  }
		 
		 
		 
		/*
		* Methodname:--> Capture Alert Text at webpage
		* Author
		* CreatedOn
		* Reviewed By
		* parameters used;---> local parameter
		* last update date:--->
		* 
		*/
		 public String Get_AlertText()
		 {
			 if(isAlertPresented())
			 {
				String AlertText= driver.switchTo().alert().getText();
				return AlertText;
			 }
			 else
				 return null;
		 }
		 
		 
		 
		 
	  /*
	   * MethodName:--->Is Alert text Presented at webpage
	   * Author:--->
	   * CreatedOn:--->
	   * ReviewedBy:--->
	   * Last UpdatedDate:--->
	   * ParametersUsed:--->Local parameters
	   */
		public boolean isAlert_text_presented(String exptext)
		{
				
				if(isAlertPresented())
				{
					String Act_alert_text=driver.switchTo().alert().getText();
					boolean flag=Act_alert_text.contains(exptext);
					return flag;
				}
				else
				{
					System.out.println("Alert not presented");
					return false;
				}
					
		}
		
		
		
		/*
		* Methodname:---> Method capture Editbox input, Autogenerated Text...
		* Author:--->
		* create on:--->
		* reviewed by:--->
		* last updated date:--->
		* parameters used:--->local parameters
		*/
		public String get_editboxInput(By locator)
		{
			String InputValue=driver.findElement(locator).getAttribute("value");
			return InputValue;
		}
		
		
		/*
		 * Methodname:---> Wait element to visible
		 * Author:--->
		 * create on:--->
		 * reviewed by:--->
		 * last updated date:--->
		 * parameters used:--->local parameters
		 */
		public WebElement waitfor_ElementVisible(String xpath)
		{
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			return element;
		}
		
		
		
		
		/*
		 * Methodname:---> Wait for alert
		 * Author:--->
		 * create on:--->
		 * reviewed by:--->
		 * last updated date:--->
		 * parameters used:--->local parameters
		 */
		public Alert waitfor_Alert()
		{
			Alert alert=wait.until(ExpectedConditions.alertIsPresent());
			return alert;
		}
		
		
		
		
		/*
		 * Methodname:---> Get Table CellAdress Using Row number and Column Number
		 * Author:--->
		 * create on:--->
		 * reviewed by:--->
		 * last updated date:--->
		 * parameters used:--->local parameters
		 */
		public WebElement Get_Table_CellAddress(String Table_xpath,int Row, int cell)
		{
			
			//Target table
			WebElement table=driver.findElement(By.xpath(Table_xpath));
			
			//Find number of rows available with in table
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			//Target fifth row 
			WebElement selected_row=rows.get(Row);
			
			//On Selected row find list of cells available
			List<WebElement> cells=selected_row.findElements(By.tagName("td"));
			
			//Get zero cell ddata
			WebElement Celladdress=cells.get(cell);
			
			return Celladdress;
			
		}
	 
	 
		/*
		 * Methodname:---> return webtable celladdress [Using record name and Column name]
		 * Author:--->
		 * create on:--->
		 * reviewed by:--->
		 * last updated date:--->
		 * parameters used:--->local parameters
		 */
		public  WebElement Webtable_Dynamic_CellAdress(String tablexpath, String recordname, int col)
		{
			//Target Webtable
			WebElement table=driver.findElement(By.xpath(tablexpath));
											
			//Find Number of rows available in table
			List<WebElement> Allrows=table.findElements(By.tagName("tr"));
			System.out.println(Allrows.size());
										
			boolean flag=false;
			WebElement CellArea=null;
			//Iterate for number of row times
			for (int i = 1; i < Allrows.size(); i++) 
			{
					//target 3rd row
					WebElement Selected_row=Allrows.get(i);
					//System.out.println(Selected_row.getText());
												
					//Find 3rd row column count
					List<WebElement> All_columns=Selected_row.findElements(By.tagName("td"));
											
					//Iteration for columns
					for (int j = 0; j < All_columns.size(); j++) 
					{
						//Target 3rd column
						WebElement CellAddress=All_columns.get(j);
													
						//get celltext
						String CellData=CellAddress.getText();
											
											
						if(CellData.equals(recordname))
						{
							flag=true;
							CellArea=All_columns.get(col);
							break;//break column iteration
											
						}
											
											
					}//col
									
					if(flag==true)
					{
						break; //break row iteration
					}
									
										
			}//row
			System.out.println("record available status  "+flag);
					return CellArea;				
					
									
		}//
		
		
		
}
