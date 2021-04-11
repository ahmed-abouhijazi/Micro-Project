package com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {
	private static Connection conn;
	private static String url ="jdbc:mysql://127.0.0.1:3306/internau";
	
	public static Connection getConn() {
		try {
			conn = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","fatima1112");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("problem de base de donnée");
		}catch (ClassNotFoundException e) {
			System.out.println("pilote not found");// TODO Auto-generated catch block
		} 
		return conn;
	}
}