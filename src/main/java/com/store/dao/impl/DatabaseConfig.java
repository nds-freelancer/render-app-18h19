package com.store.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {

	private static String driver = "com.mysql.jdbc.Driver";
//	private static String dbURL = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6636966";
//	private static String user = "sql6636966";
//	private static String pass = "c4i23HbWQL";

	private static String dbURL = "jdbc:mysql://db4free.net:3306/sql6636966";
	private static String user = "sql6636966";
	private static String pass = "qaz@#$123";
	
	
	public static Connection getConnection() throws Exception {
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(dbURL, user, pass);
		return conn;
	}
}
