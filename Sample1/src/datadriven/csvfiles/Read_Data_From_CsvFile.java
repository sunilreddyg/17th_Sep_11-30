package datadriven.csvfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFile {

	public static void main(String[] args) throws IOException
	{
		
		//Target file location
		String filepath="src\\datadriven\\csvfiles\\Input.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		
		//Create object csvreader
		CSVReader reader=new CSVReader(fr);
	
		//Read header
		String Header[]=reader.readNext();
		System.out.println("1st index value is => "+Header[0]);
		System.out.println("2nd index value is => "+Header[1]);
		
		//Read First line
		String line1[]=reader.readNext();
		System.out.println("line1 1st index value is => "+line1[0]);
		System.out.println("line1 2nd index value is => "+line1[1]);
		
		
		//Read second line
		String line2[]=reader.readNext();
		System.out.println("line2 1st index value is => "+line2[0]);
		System.out.println("line2 2nd index value is => "+line2[1]);
		
		
		
		
	}

}
