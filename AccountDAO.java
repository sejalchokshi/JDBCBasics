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
			
			// Insert Command or Execute a SQL Command using statement object
			int executeUpdate = statement.executeUpdate("insert into accounts (id, firstname, lastname, balance) values (8,'John','Doe',100)");
			
			System.out.println("Execute Update : "+executeUpdate);
			
			// UPDATE Command
			int updateResult = statement.executeUpdate("UPDATE accounts SET balance = 50 WHERE id = 2");
			System.out.println("Update Result: " + updateResult);

			// DELETE Command
			int deleteResult = statement.executeUpdate("DELETE FROM accounts WHERE id = 3");
			System.out.println("Delete Result: " + deleteResult);

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
