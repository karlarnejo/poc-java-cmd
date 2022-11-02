package com.poc.demo.models;

import com.poc.demo.entity.Userr;

public class UserrJwtModel {
	
	private String username;
	private String password;
	
	public UserrJwtModel() {
		
	}
	
	public UserrJwtModel(Userr userr) {
		this.setUsername(userr.getUsername());
		this.setPassword(userr.getPassword());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
