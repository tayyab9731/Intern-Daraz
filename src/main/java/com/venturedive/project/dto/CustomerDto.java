package com.venturedive.project.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author VD
 *
 */

public class CustomerDto {
	private long id;
	private String name;
	
	private String email;
	private String password;
	private boolean isActive;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getisActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public long getId() {
	return id;
	}
	
public void setId(long id)
{this.id=id;}
	
	
	
	
}
