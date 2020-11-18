package com.cg.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionC {
	static Connection con;
	public static Connection getConnection() throws SQLException
	{
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","system");
		return con;
	}

}
