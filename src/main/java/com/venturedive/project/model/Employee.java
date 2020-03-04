package com.venturedive.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Employee  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long emp_id;
	private String name;
	private String address;
	private long salary;

	@OneToOne(mappedBy="employee")
	private EmployeeDetails employeedetails;

	public Employee(String name, String address, long salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;

	}

	public Long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public EmployeeDetails getDetails() {
		return employeedetails;
	}

	public void setDetails(EmployeeDetails employeedetails) {
		this.employeedetails = employeedetails;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}