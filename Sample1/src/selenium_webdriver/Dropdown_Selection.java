package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection 
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/mobile/Credit-Card_TU.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtName")).clear();
		driver.findElement(By.id("txtName")).sendKeys("Newuser");
		
		
		//Select male Radio button
		driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[2]/div/ul/li[1]/label")).click();
		Thread.sleep(3000);
		
		//select female radio button
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//Idnetify Dateofbirth Editbox
		driver.findElement(By.id("txtDOB")).click();
		
		
		//IDentify Year Dropdown at datepicker
		new Select(driver.findElement(By.cssSelector(".ui-datepicker-year")))
		.selectByVisibleText("2000");
		
		//Identify Month Dropdown at datepicker
		new Select(driver.findElement(By.cssSelector(".ui-datepicker-month")))
		.selectByVisibleText("Jun");
		
		//click date
		driver.findElement(By.linkText("21")).click();
		
		//Select City Dropdown
		new Select(driver.findElement(By.id("ddlCity")))
		.selectByVisibleText("PUNE");
		
		
		//Select income details
		new Select(driver.findElement(By.id("ddlIncome")))
		.selectByVisibleText("45000-55000");
		
		//Select checkbox
		driver.findElement(By.id("chkAutho")).click();
	}

}
