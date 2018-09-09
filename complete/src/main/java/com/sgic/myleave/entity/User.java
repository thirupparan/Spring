package com.sgic.myleave.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
	 
	Integer id;

	@NotEmpty(message="Name can not be null.")
	@Size(min=2, max=5, message="Name has to be 2-5 characters")
	 String userName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
