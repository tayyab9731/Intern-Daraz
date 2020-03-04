package com.venturedive.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venturedive.project.dto.EmployeeDto;
import com.venturedive.project.model.Employee;
import com.venturedive.project.model.EmployeeDetails;
import com.venturedive.project.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;

	public void addEmployee(EmployeeDto employee) {
		Employee employe = new Employee(employee.getName(), employee.getAddress(), employee.getSalary());

		EmployeeDetails employeedetails = new EmployeeDetails(employee.getEmail(), employee.getPassword(),
				employee.getisActive());
		employeedetails.setEmployee(employe);
		employe.setDetails(employeedetails);

		// customerrepository.save(customer);
		employeerepository.save(employe);
	}
}
