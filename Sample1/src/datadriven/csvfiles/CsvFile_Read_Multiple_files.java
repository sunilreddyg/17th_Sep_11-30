package datadriven.csvfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class CsvFile_Read_Multiple_files 
{

	public static void main(String[] args) throws IOException 
	{
		//Target file location
		String filepath="src\\datadriven\\csvfiles\\Input.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		
		//Create object csvreader
		CSVReader reader=new CSVReader(fr);
		reader.readNext();  //Read Header..
		
		
		//Write conditional loop to iterate until file had data.
		String line[];  //Initiate array variable
		while((line=reader.readNext())!=null)
		{
			System.out.println(line[0]+"   "+line[1]);
		}
		
		
		

	}

}
