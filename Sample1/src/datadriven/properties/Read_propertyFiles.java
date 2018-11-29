package datadriven.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_propertyFiles {

	public static void main(String[] args) throws IOException {
		
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
		
		//Set value
		repository.setProperty("UID", "Sunil");
		
		String Path_output="src\\datadriven\\properties\\Output.properties";
		//store Runtime property to output file
		repository.store(new FileOutputStream(Path_output), "New runtime Data");

	}

}
