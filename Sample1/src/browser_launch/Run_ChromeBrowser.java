package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Run_ChromeBrowser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Chrome is a not default browser for selenium. To launch
		 * chrome in local system we must download chromedriver.exe file
		 * using below navigations.
		 * 
		 * 	URL;-->  https://www.seleniumhq.org/download/
		 * 			 Under thirdparty drivers click <<" google chromedriver">> link
		 * 			 select chromedriver w.r.t chrome browser version
		 * 			 click on latest chromedriver link
		 * 			 Downlaod zip format file for windows  [32 bit support both hotspots]
		 * 			 After downloas unzip file location to project
		 */
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");
		

	}

}
