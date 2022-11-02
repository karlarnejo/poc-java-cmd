package com.poc.demo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="userr")
@NamedQuery(name="Userr.findAll", query="SELECT u FROM Userr u")
public class Userr implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String username;
	private String password;
	
	public Userr() {
		
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
