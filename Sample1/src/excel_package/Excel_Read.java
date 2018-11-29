package excel_package;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Read {

	public static void main(String[] args) 
	{
		
		try {
			
			//how to create connection from excelsheet to selenium
			FileInputStream fi=new FileInputStream("Testdata\\Excel_inpudata.xls");
			//How to create connection for workbook
			Workbook wbook=Workbook.getWorkbook(fi);
			//how to create Connection for sheet
			Sheet wsht=wbook.getSheet("URL");
			
			//how to read the data from current excel sheet
			String app_url=wsht.getCell(0,1).getContents();
			System.out.println(app_url);
			
			//Application
			WebDriver driver=new FirefoxDriver();
			driver.get(app_url);
			driver.manage().window().maximize();
			
			//Another sheet
			Sheet wsht1=wbook.getSheet("FB_Creation");
			
			//How many rows are present in current excel sheet
			int rc=wsht1.getRows();
			System.out.println(rc);
			
			//Forloops 
			for (int i = 1; i < rc; i++) 
			{
				String fn=wsht1.getCell(0,i).getContents();
				String ln=wsht1.getCell(1,i).getContents();
				String mob=wsht1.getCell(2,i).getContents();
				String pwd=wsht1.getCell(3,i).getContents();
				String da=wsht1.getCell(4,i).getContents();
				String mon=wsht1.getCell(5,i).getContents();
				String yer=wsht1.getCell(6,i).getContents();
				
				driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).clear();
				driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).sendKeys(fn);
				
				driver.findElement(By.cssSelector("input[name='lastname']")).clear();
				driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(ln);
				
				driver.findElement(By.cssSelector("input#u_0_o")).clear();
				driver.findElement(By.cssSelector("input#u_0_o")).sendKeys(mob);
				
				driver.findElement(By.xpath("//input[@name='reg_passwd__']")).clear();
				driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pwd);
				
				
				new Select(driver.findElement(By.xpath("//select[starts-with(@id,'day')]"))).selectByVisibleText(da);
				new Select(driver.findElement(By.cssSelector("select[id^='month']"))).selectByVisibleText(mon);
				new Select(driver.findElement(By.cssSelector("select[id='year'][title='Year']"))).selectByVisibleText(yer);
				
				
			}
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
