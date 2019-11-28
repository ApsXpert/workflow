package com.self.workflow.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection { 
	 public static Connection createConnection()
	 {
	 Connection con = null;
	 String url = "jdbc:mysql://localhost:3306/workflow"; 
	 String username = "root"; 
	 String passw = "root"; 
	 
	 try 
	 {
		 try 
		 	{
			 	Class.forName("com.mysql.jdbc.Driver");  
		 	} 
		 catch (ClassNotFoundException e)
		 	{
			 	e.printStackTrace();
		 	}
	 
		 	con = DriverManager.getConnection(url, username, passw); 
		 	System.out.println("Printing connection object "+con);
	 } 
	 catch (Exception e) 
	 	{
		 	e.printStackTrace();
	 	}
	 
	 return con; 
	 }
} 

