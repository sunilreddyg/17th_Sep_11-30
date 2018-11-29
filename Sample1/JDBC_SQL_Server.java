package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_SQL_Server 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		//JDBC Class 
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String dbURL = "jdbc:sqlserver://localhost;database=MQ,user=sa;password=secret";
		//Connection for Database
		Connection con=DriverManager.getConnection(dbURL);
		
		
		//Execute statement
		ResultSet rs=con.createStatement().executeQuery("select * from userlist");
		
		
		
		
		
		//Iterate until table had last record.
		while(rs.next())
		{
			//Get record details using parameter name
			String username=rs.getString("name");
			System.out.println("=> "+username);
			
			//Get Email
			String usermail=rs.getString("email");
			System.out.println("=> "+usermail);
			
			
			
		}

	}

}
