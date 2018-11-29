package verificationcommands;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Current_SystemDate_At_Application {

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:--> verify System date match with departure date
		 * 
		 * 			Given http://makemytrip.com
		 * 			then verify Deparute date match with system date.
		 */
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Capture Data from Departure editbox
		WebElement Departure_editbox=driver.findElement(By.id("hp-widget__depart"));
		//Get Inputvalue from Editbox [typed or autogenarated]
		String Ddate=Departure_editbox.getAttribute("value");
		
		
		//Create simple date formatter.
		DateFormat df=new SimpleDateFormat("dd MMM, EEE");
		//Capture system date
		Date d=new Date();    //import from  java.util;
		//using dateformatter convert system date
		String Sdate=df.format(d);
		
		//Verify system date and departue date
		if(Ddate.equals(Sdate))
			System.out.println("As expected Departue date match with system date");
		else
			System.out.println("Departue date mismatch with system date");
		
		
		/*
		 * java supporting time formatters
		 * 		URL:-->  https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		 */
		
	}

}
