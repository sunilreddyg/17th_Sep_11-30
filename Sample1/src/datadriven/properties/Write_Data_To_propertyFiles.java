package datadriven.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_To_propertyFiles 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Create object for property files
		Properties obj=new Properties();
		
		
		obj.setProperty("UID", "Sunil");
		obj.setProperty("UID1", "Sunil1");
		obj.setProperty("UID2", "Rajesh");
		
		
		String filepath="src\\datadriven\\properties\\Output.properties";
		//store Runtime property to output file
		obj.store(new FileOutputStream(filepath), "New runtime Data");
	}

}
