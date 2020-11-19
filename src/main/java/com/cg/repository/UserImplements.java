package com.cg.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.model.IUser;
import com.cg.dto.*;

public class UserImplements implements IUser {
	Connection con;
	public UserImplements()
	{
		try
		{
			
			con=ConnectionC.getConnection();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	public User_Role addUser(User_Role userName) throws SQLException
	{
	  	PreparedStatement ps=con.prepareStatement("insert into User_Role values(?,?,?)");
	  	
	  	
	  	ps.setString(1, userName.getUserName());
	  	ps.setString(2, userName.getPassword());
	  	ps.setString(3, userName.getRoleCode());
	  	
	  	
	  	ps.executeUpdate();
	  	return userName;
	  	//hello
	  	//lkkk
	}

}
