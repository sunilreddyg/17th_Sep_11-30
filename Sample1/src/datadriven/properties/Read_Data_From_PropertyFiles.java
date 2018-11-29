package datadriven.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Read_Data_From_PropertyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target property file location
		String filepath="src\\datadriven\\properties\\Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File located");
		
		//Create object for Repository
		Properties repository=new Properties();
		repository.load(fi);
		
		
		//Get value using keyname
		String appurl=repository.getProperty("url");
		WebDriver driver=new ChromeDriver();
		driver.get(appurl);
		
		
		//Get username location and input from property files
		String UID=repository.getProperty("username");
		String UID_locator=repository.getProperty("username_locator");
		
		//Type Text into username
		driver.findElement(By.xpath(UID_locator)).clear();
		driver.findElement(By.xpath(UID_locator)).sendKeys(UID);

		
		
		
		//Get username location and input from property files
		String PWD=repository.getProperty("password");
		String PWD_locator=repository.getProperty("password_locator");
		
		//Type Text into password
		driver.findElement(By.xpath(PWD_locator)).clear();
		driver.findElement(By.xpath(PWD_locator)).sendKeys(PWD);

		
		
		
		
		
		
	}

}
