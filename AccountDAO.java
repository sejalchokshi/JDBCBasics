package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {

	public static void main(String[] args) {
	
		try {
			// Register JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create Connection Object
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","MYhome@123");
			
			// Create a statement Object
			Statement statement = connection.createStatement();
			
			// Execute a SQL Command using statement object
			int executeUpdate = statement.executeUpdate("insert into accounts (id, firstname, lastname, balance) values (2,'John','Doe',100)");
			
			System.out.println("Execute Update : "+executeUpdate);
			
			//Close Statement and connection
			statement.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
