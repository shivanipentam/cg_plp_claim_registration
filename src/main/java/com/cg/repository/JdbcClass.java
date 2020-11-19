package com.cg.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcClass {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection con;
		try
		{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","system");
			if(con!=null)
			{
				System.out.println("Connection Successful");
			}
			//DriverManager.registerDriver(new com.cg.jdbc.Driver());
			//Statement smt=con.createStatement();
			
			//String query="Cre"
		}
		catch(SQLException e)
		{
			System.out.println("Not");
		}

	}

}
