package com.venturedive.project.dto;

public class EmployeeDto {
	private long id;
	private String name;
    private String address;
  private long salary;
	
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
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
	
	
}
