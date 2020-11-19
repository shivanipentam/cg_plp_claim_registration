package com.cg.dto;

import java.sql.SQLException;

import com.cg.model.UserRole;
public interface IUser {
	
	public UserRole addU(UserRole user) throws SQLException;
	

}
