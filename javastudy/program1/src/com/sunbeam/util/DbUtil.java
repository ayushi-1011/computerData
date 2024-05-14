package com.sunbeam.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static final String URL ="jdbc:mysql://localhost:3306/dac_db";
	public static final String USERNAME = "Ayushi";
	public static final String PASSWORD ="ayushi123";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}

}
