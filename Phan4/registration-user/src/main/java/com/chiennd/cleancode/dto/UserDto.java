package com.chiennd.cleancode.dto;

import lombok.Data;

@Data
public class UserDto {

	protected String name;
	protected String email;
	protected String password;
	protected String mode;
	private StudentDto student;
	private TeacherDto teacher;
	
	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", password=" + password + ", mode=" + mode + "]";
	}

}
