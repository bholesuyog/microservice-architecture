package com.app.dto;

public class ResponseDTO {

	private DepartmentDTO department;
	private UserDTO user;

	public ResponseDTO() {

	}

	public ResponseDTO(DepartmentDTO department, UserDTO user) {
		super();
		this.department = department;
		this.user = user;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

}
