package com.cg.dto;

import java.sql.SQLException;

import com.cg.model.*;

public interface IUserRepo {
	public UserRole addUserRole(UserRole userName) throws SQLException;
	
}
