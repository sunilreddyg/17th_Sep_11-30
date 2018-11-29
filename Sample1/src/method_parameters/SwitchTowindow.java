package method_parameters;

import org.openqa.selenium.By;

public class SwitchTowindow 
{

	public static void main(String[] args) throws Exception 
	{
		//Create object for Repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.loadApp("https://www.hdfcbank.com/wholesale/default.htm");
		obj.setTimeout(20);
		obj.Capturescreen("WholeSale_mainpage");
		
		
		obj.Select_dropdown(By.id("accesspointsselect"), "ATM");
		Thread.sleep(4000);
		obj.switchto_window("ATMs in Mumbai");
		obj.Capturescreen("ATM window");
		
		Thread.sleep(4000);
		obj.switchto_window("Wholesale Banking");
		obj.Capturescreen("WholeSale_mainpage_From_ATMwindow");
		
		
		//Click link to open new window
		obj.Click_element(By.linkText("HDFC Securities"));
		Thread.sleep(4000);
		obj.switchto_window("Online Trading");
		obj.Capturescreen("OnlineTraiding");
		
		
		
	}

}
