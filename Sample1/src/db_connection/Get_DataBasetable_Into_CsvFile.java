package db_connection;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opencsv.CSVWriter;

public class Get_DataBasetable_Into_CsvFile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		
		//JDBC Class 
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String dbURL = "jdbc:sqlserver://localhost;database=MQ,user=sa;password=secret";
		//Connection for Database
		Connection con=DriverManager.getConnection(dbURL);
		
		
		//Execute statement
		ResultSet rs=con.createStatement().executeQuery("select * from userlist");
		
		FileWriter fw=new FileWriter("src\\db-connection\\Db.csv");
		CSVWriter writer=new CSVWriter(fw);
		writer.writeAll(rs, true, true);
		writer.close();
		

	}

}
