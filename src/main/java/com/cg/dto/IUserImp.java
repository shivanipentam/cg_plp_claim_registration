package com.cg.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cg.exception.*;
import com.cg.dto.IUser;

import com.cg.model.UserRole;

public class IUserImp implements IUser{
	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	
	public IUserImp() throws SQLException
	{
		con=ConnectionC.getConnection();
	}
	
  public UserRole addU(UserRole u) throws SQLException
  {
	  ps=con.prepareStatement("insert into UserRole values(?,?,?)");
	  ps.setString(1, u.getUserName());
	  ps.setString(2, u.getPassword());
	  ps.setString(3, u.getRoleCode());
	  
	  ps.executeUpdate();
	  return u;
  }

	
}
