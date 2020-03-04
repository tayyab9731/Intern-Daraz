package com.venturedive.project.model;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
@Entity

@Inheritance(strategy=InheritanceType.JOINED) 
public class Employee extends AbstractPersistable<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;
private String name;
    private String address;
  private long salary;

    @OneToOne(mappedBy = "employee", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private EmployeeDetails details;

    public Employee( String name,String address, long salary) {
		super();
		this.name=name;
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
		return details;
	}

	public void setDetails(EmployeeDetails details) {
		this.details = details;
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