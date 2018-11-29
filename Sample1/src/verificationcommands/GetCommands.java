package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/?_rdr");
		driver.manage().window().maximize();
		
		//Identify location at webpage and store locaiton to referral
		WebElement email_editbox=driver.findElement(By.id("u_0_r"));

		
		
		//Get Runtime tagname
		String Runtime_tagname=email_editbox.getTagName();
		System.out.println("Element tagname is  => "+Runtime_tagname);
		
		
		/*
		 * Getlocation:-->
		 * 		method return object x and y coordinates
		 */
		Point Obj_point=email_editbox.getLocation();
		int obj_x=Obj_point.getX();
		int obj_y=Obj_point.getY();
		System.out.println("object x is =>"+obj_x +"     "+"object y is =>"+obj_y);
		
		//using x and y  coordinates verify element visible..
		if(obj_x > 0)
			System.out.println("element visible");
		else
			System.out.println("element not visible");
		
		
		/*
		 * Getsize:-->
		 * 		 method return object height and width
		 */
		Dimension obj_dim=email_editbox.getSize();
		int obj_height=obj_dim.getHeight();
		int obj_width=obj_dim.getWidth();
		System.out.println("object height => "+obj_height+"   "+"Object width =>"+obj_width);
		
		//using height and width verify element visibility
		if(obj_height > 0)
			System.out.println("element visible at webpage");
		else
			System.out.println("element not visible at webpage");
		
		
		
		
	}

}
