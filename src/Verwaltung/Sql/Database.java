package Sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.Driver;
import java.sql.DriverManager;

import com.mysql.jdbc.*;

import Verwaltung.Student;

// Connecting to the Database
public class Database
{
	
	// Creates the Connection to the Database
	public static Connection Open(String host, String port, String userName, String password) throws SQLException
	{
		// The Connection
		com.mysql.jdbc.Connection con = null;
		try
		{
			// MySQL jdbc Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Opening the connection
			con = (com.mysql.jdbc.Connection) DriverManager.getConnection(
																		"jdbc:mysql://"
																		+ host 
																		+ ":" 
																		+ port 
		 																+ "/exceldatamanagement"
																		, userName
																		, password
																		);
			System.out.print("connection established");
			return con;
		
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return con;
	}
	
	// Requests the complete Table "schueler" from the Database excelmanagementdata.
	public static void requestStudentTable(com.mysql.jdbc.Connection con) 
	{			
		try
		{
			// Preparing the request query
			Statement stmt = con.createStatement();  
			// Result 
			ResultSet rs = stmt.executeQuery("select * from schueler");  
			rs.absolute(0);
			while(rs.next()) 
			{
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}		
			
			con.close();
			
		} 
		catch (SQLException e)
		{
				// TODO Auto-generated catch block
				e.printStackTrace();		
		}  
	}
	
	// Requests the complete Table "schueler from the Database excelmanagementdata.
		public static void insertNewStudent(Connection connection, Student student) 
		{			
			try
			{
				// Preparing the request query
				Statement stmt = connection.createStatement();  
				// Result 
				ResultSet rs = stmt.executeQuery(
						  "INSERT INTO schueler "
						+ "("
						+ "Name"
						+ ","
						+ "Klassenbezeichnung"
						+ ","
						+ "Vorname"
						+ ","
						+ "Geburtsdatum" 
						+ ","
						+ "Klassenstufe"
						+ ","
						+ " Geschlecht)\r\n"
								
								+ "VALUES ('" 
								+ ((Student) student).GetName() 
								+ "', '" 
								+ ((Student) student).GetKlassenName() 
								+ "', '" 
								+ ((Student) student).GetVorname() 
								+ "', '" 
								+ ((Student) student).GetGeburtsdatum().toString() 
								+ "', '" 
								+ ((Student) student).GetKlassenName() 
								+ "', '" 
								+ ((Student) student).GetGeschlecht() 
								+ "'); "
								);		
				connection.close();
			} 
			catch (SQLException e)
			{
					// TODO Auto-generated catch block
					e.printStackTrace();		
			}  
		}
}