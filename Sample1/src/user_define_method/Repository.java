package user_define_method;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
	
	public WebDriver driver;  //Global variable
	public WebDriverWait wait;
	
	
	/*
	 * Methodname:-->
	 * Author
	 * CreatedOn
	 * ReviewedBy
	 * parametersused
	 * lastupdateddate:--->
	 */
	public void browserlaunch(String browsername)
	{
		switch (browsername) 
		{
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;

		default:System.out.println("Browser name mismatch");
			break;
		}
		
	}
	
	
	/*
	 * MethodName:--> Open Diff Applications
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void LoadApp(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * MethodName:--> Set Timeouts
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void setTimeout(int Sec)
	{
		//Implicit timeout..
		driver.manage().timeouts().implicitlyWait(Sec, TimeUnit.SECONDS);
		
		//Explicit timeout
		wait=new WebDriverWait(driver, Sec);
	}
	
	/*
	 * MethodName:--> Enter text into Editbox..[using locator xpath]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Enter_textTo_Eb(String Ele_xpath, String Input)
	{
		driver.findElement(By.xpath(Ele_xpath)).clear();
		driver.findElement(By.xpath(Ele_xpath)).sendKeys(Input);
	}
	
	
	/*
	 * MethodName:--> Enter text into Editbox..using locator class
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Enter_textTo_Eb(By locator, String Input)
	{
		WebElement Editbox=driver.findElement(locator);
		
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
	 * MethodName:-->wait for element visible
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void wait_for_Element_Visible(By locator)
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
		new Actions(driver).moveToElement(Element).perform();
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
	
	
	//==============================================================
	//UserDefined functions..
	
	/*
	 * MethodName:-->Verify title presented
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public boolean Istitle_Presented(String exp_title)
	{
		//Capture runtime title
		String Runtime_title=driver.getTitle();
		//Verify Runtime title contains expected title
		boolean flag=Runtime_title.contains(exp_title);
		
		return flag;
	}
	
	
	/*
	 * MethodName:--->verify url presented at webpage
	 * Author:--->
	 * CreatedOn:--->
	 * ReviewedBy:--->
	 * Last UpdatedDate:--->
	 * ParametersUsed:--->Local parameters
	 */
	public boolean isurl_Presented(String exp_url)
	{
		//Capture Runtime url
		String Runtime_url=driver.getCurrentUrl();
		boolean flag=Runtime_url.contains(exp_url);
		
		return flag;
	}
	

	/*
	 * MethodName:--->verify page source [title,url,element,text---etc]
	 * Author:--->
	 * CreatedOn:--->
	 * ReviewedBy:--->
	 * Last UpdatedDate:--->
	 * ParametersUsed:--->Local parameters
	 */
	public boolean is_Element_Presented_AtSource(String text_or_element)
	{
		//Get Runtime pageSource
		String Runtime_Source=driver.getPageSource();
		boolean flag=Runtime_Source.contains(text_or_element);
		
		return flag;
	}
	
	
	/*
	 * MethodName:--->verify text visible at webpage
	 * Author:--->
	 * CreatedOn:--->
	 * ReviewedBy:--->
	 * Last UpdatedDate:--->
	 * ParametersUsed:--->Local parameters
	 */
	public boolean is_textVisible_Atpage(String exp_text)
	{
		//Identify page
		WebElement page=driver.findElement(By.tagName("body"));
		//Capture text at webpage
		String page_visibletext=page.getText();
		//Verify expected text visible at webpage
		boolean flag=page_visibletext.contains(exp_text);
		
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
		 String Element_text=driver.findElement(locator).getText();
		 boolean flag=Element_text.contains(exp_text);
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
	 public boolean Wait_And_Verify_TextAt_location(By locator,String exp_text)
	 {
		 boolean flag=wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, exp_text));
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
			  {
				  return false;
			  }
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
					String Alerttext=driver.switchTo().alert().getText();
					return Alerttext;
				}
				else
					return null;
			}
		 
			/*
			* Methodname:--> Accept or dismiss alert window
			* Author
			* CreatedOn
			* Reviewed By
			* parameters used;---> local parameter
			* last update date:--->
			* 
			*/
			public void  Close_Alert()
			{
				if(isAlertPresented())
				 {
					 driver.switchTo().alert().accept();
				 }
				else
					System.out.println("alert not presented");

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
				WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
				return Element;
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
