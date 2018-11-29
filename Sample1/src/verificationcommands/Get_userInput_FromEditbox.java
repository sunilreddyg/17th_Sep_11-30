package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Get_userInput_FromEditbox 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:-->
		 * 		Verify Operatorname and Locationname autogenarated During
		 * 		mobile reacharge functionality
		 * Steps:-->
		 * 		Launch and load patym application
		 * 		Make sure Prepaid radio button
		 * 		Enter mobile number
		 * 
		 * Expected:-->
		 * 		System should autogenarate Operator and location
		 */
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();

		
		//target location
		WebElement Mobilenum=driver.findElement(By.xpath("//label[text()='Mobile Number']/preceding-sibling::input"));
		Mobilenum.clear();
		Mobilenum.sendKeys("9030248855");
		Thread.sleep(3000);
			
		WebElement Operator_editbox=driver.findElement(By.xpath("//label[text()='Operator']/preceding-sibling::input"));
		//get input from editbox
		String OperatorName=Operator_editbox.getAttribute("value");
		System.out.println(OperatorName);
			
		//write condition to accept on record match
		if(OperatorName.equals("Airtel"))
			System.out.println("correct Operator displayed");
		else
			System.out.println("Wrong operator displayed");
			
			
		//target location
		WebElement circle=driver.findElement(By.xpath("//label[text()='Circle']/preceding-sibling::input"));
		//get Circle input value at runtime
		String Circle_name=circle.getAttribute("value");
		System.out.println(Circle_name);
			
			
		if(Circle_name.equals("Andhra Pradesh"))
			System.out.println("correct circle displayed");
		else
			System.out.println("Wrong circle displayed");
			
		
		
		
		
		
		

	}

}
