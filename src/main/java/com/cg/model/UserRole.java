package com.cg.model;

public class UserRole {

	private String userName;
	private String password;
	private String roleCode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	@Override
	public String toString() {
		return "User_Role [userName=" + userName + ", password=" + password + ", roleCode=" + roleCode + "]";
	}
	public UserRole(String userName, String password, String roleCode) {
		super();
		this.userName = userName;
		this.password = password;
		this.roleCode = roleCode;
	}
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
