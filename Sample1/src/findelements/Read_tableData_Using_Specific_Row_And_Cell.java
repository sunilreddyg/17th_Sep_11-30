package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_tableData_Using_Specific_Row_And_Cell {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Identify list of rows available with in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Target Row  [4th row]
		WebElement Selected_row=rows.get(4);
		
		//Find list of cells avilable under selected row
		List<WebElement> cells=Selected_row.findElements(By.tagName("td"));
		
		//get cell data
		String CompanyName=cells.get(0).getText();
		String High_price=cells.get(3).getText();	
		
		System.out.println(CompanyName+"   "+High_price);
		
	}

}
