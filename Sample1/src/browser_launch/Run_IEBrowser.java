package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Run_IEBrowser {

	public static void main(String[] args) 
	{
		
		/*
		 * Downlaod IEDriverServer.exe file before launch ie browser.
		 * Url:--> https://www.seleniumhq.org/download/
		 * 		=> Download InternetExplorerDriver server
		 * 		=> Download w.r.t selenium version.
		 * 		=> After download zipformat file unzip file location and
		 * 	   		configure .exe under project
		 * 
		 * 	browser version:-->   IE8, IE9 ,IE10, IE11
		 *  
		 *  	Note:--> disable all privacy and security settings.
		 *  				Nav:--> Internet Options
		 */
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");

	}

}
