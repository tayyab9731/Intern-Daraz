package com.venturedive.project.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.venturedive.project.dto.CustomerDto;
import com.venturedive.project.dto.EmployeeDto;
import com.venturedive.project.model.UserDetails;
import com.venturedive.project.model.Employee;
import com.venturedive.project.model.EmployeeDetails;
import com.venturedive.project.model.customer;
import com.venturedive.project.repositories.CustomerRepository;
import com.venturedive.project.repositories.EmployeeRepository;

public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;


//	public List<Customer> getAllUsers()
//	{
//		List<Customer> users=new ArrayList<>();
//		customerrepository.findAll().forEach(users::add);
//		return users;
//	}
	public void addEmployee(EmployeeDto employee) {
		Employee employe=new Employee(employee.getName(),employee.getAddress(),employee.getSalary());
	
	EmployeeDetails employeedetails=new EmployeeDetails(employee.getEmail(),employee.getPassword(),employee.getisActive());
	employeedetails.setEmployee(employe);
	employe.setDetails(employeedetails);


		//customerrepository.save(customer);
		employeerepository.save(employe);
	}
}
