package com.Employee.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;

public class MySQLConnection {
	
	private static String db;
	
	private static MySQLConnection mysqlconnection = new MySQLConnection();
	
	Connection connection;
	
	private MySQLConnection() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter table name : ");
			db=sc.next();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db, "root", "R@ghu0123");
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
	}
	public static Connection getInstance() {
		return mysqlconnection.connection;
		
	}
	public static void main(String[] args) {
		System.out.println(MySQLConnection.getInstance());
	}

}
