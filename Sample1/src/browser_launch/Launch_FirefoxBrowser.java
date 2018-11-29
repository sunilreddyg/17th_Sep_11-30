package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FirefoxBrowser {

	public static void main(String[] args) 
	{
		/*
		 * Download Geckodriver:-->
		 * 		geckodriver version:-->  v0.21.0
		 * 		firefoxbrowser version:--> 57 and greater
		 * 		webdriver version:-->  3.11 and greater
		 * 
		 * 
		 * 		URL:--> https://github.com/mozilla/geckodriver/releases
		 * 		Download w.r.t  OS and Hotspot
		 * 		Download geckodriver-v0.21.0-win64.zip
		 * 		Save file into backupdrive
		 * 		unzip file location to project folder
		 * 	
		 */
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://facebook.com");

	}

}
