package com.sunbeam.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/dac_db";
	private static final String USERNAME = "Ayushi";
	private static final String PASSWORD = "ayushi123";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}
