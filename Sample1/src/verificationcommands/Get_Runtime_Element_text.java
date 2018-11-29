package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Element_text {

	public static void main(String[] args) {
		/*
		 * Testcase:--> Verify email validation with invalid domain
		 * Steps:-->
		 * 			=> Launch Browser and load outlook webpage
		 * 			=> click signin button
		 * 			=> Enter invalid email address with invalid domainname
		 * 			=> Click On Next button
		 * Expected:==>
		 * 			System should display appropriate error msg 
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		WebElement Signin_button=driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader']"));
		Signin_button.click();
		
		WebElement Email_Editbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("qadarshan@gmail.com");
		
		WebElement Signin_next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Signin_next_btn.click();
		
		//Identify error location
		WebElement Error_location=driver.findElement(By.id("usernameError"));
		//get element outter text
		String Runtime_Uid_errmsg=Error_location.getText();
		
		//Write Condition to accept only when text is visible
		if(!Runtime_Uid_errmsg.isEmpty())   //!--NOT
		{
			System.out.println("Text visible at webpage");
			
			//Verify Runtime text with expected text
			String Exp_uid_errmsg="That Microsoft account doesn't exist. Enter a different account or get a new one.";
			
			if(Runtime_Uid_errmsg.equalsIgnoreCase(Exp_uid_errmsg))
				System.out.println("Expected Err msg displayed on invalid domain");
			else
				System.err.println("wrong err msg displayed on invalid domain");
		}
		else
		{
			System.err.println("text not visibe at webpage");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
