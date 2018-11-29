package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Row_And_Cells 
{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Identify list of rows available with in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		boolean flag=false;
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			//Target Row  [4th row]
			WebElement Selected_row=rows.get(i);
			
			//Find list of cells avilable under selected row
			List<WebElement> cells=Selected_row.findElements(By.tagName("td"));
			
			//Iterate for cells
			for (int j = 0; j < cells.size(); j++) 
			{
				//Target Eachcell
				WebElement EachCell=cells.get(j);
				String CellData=EachCell.getText();
				
				if(CellData.equals("TATMOT"))
				{
					flag=true;
					System.out.println("Record at row number is => "+i);
					System.out.println("Record at cell number is => "+j);
					
					System.out.println(Selected_row.getText());
				}

			}//cells
			
			
		}//rows

		System.out.println("Record available status is => "+flag);
	}

}
