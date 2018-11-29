package selenium_inher;

import org.openqa.selenium.By;

public class Testcase extends Repository
{

	
	/*
	 * Methodname:--> UserLogin
	 * Author
	 * CreatedOn
	 * ReviewedBy
	 * parametersUsed:-->
	 * Lastupdated Date:-->
	 */
	public void User_login(String UID,String PWD)
	{
		Enter_texto_toEb(By.id("email"), UID);
		Enter_texto_toEb(By.id("pass"), PWD);
		
		//Variable from parent class
		driver.findElement(By.id("loginbutton")).click();
	}
	
	
	/*
	 * Methodname:--> User signup
	 * Author
	 * CreatedOn
	 * ReviewedBy
	 * parametersUsed:-->
	 * Lastupdated Date:-->
	 */
	public void User_registration(String Fname, String Surname, String email, String Retypemail, String pwd)
	{
		//Method from parent class
		Enter_texto_toEb(By.id("u_0_j"), Fname);
		Enter_texto_toEb(By.id("u_0_l"), Surname);
		Enter_texto_toEb(By.id("u_0_o"), email);
		Enter_texto_toEb(By.id("u_0_r"), Retypemail);
		
		// variable from parent class
		driver.findElement(By.id("u_0_v")).clear();
		driver.findElement(By.id("u_0_v")).sendKeys(pwd);
	}
	
	/*
	 * Methodname:--> Messenger login
	 * Author
	 * CreatedOn
	 * ReviewedBy
	 * parametersUsed:-->
	 * Lastupdated Date:-->
	 */
	public void  Messenger_login(String UID, String PWD)
	{
		Click_Element(By.linkText("Messenger"));
		Enter_texto_toEb(By.id("email"), UID);
		Enter_texto_toEb(By.id("pass"), PWD);
		driver.findElement(By.id("loginbutton")).click();
	}
	
}
