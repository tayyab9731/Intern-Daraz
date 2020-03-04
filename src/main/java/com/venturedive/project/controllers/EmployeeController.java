package com.venturedive.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.venturedive.project.dto.EmployeeDto;
import com.venturedive.project.services.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	@PostMapping(value = "/employee")
	public void addUser(@RequestBody EmployeeDto employee) {
		
		employeeservice.addEmployee(employee);
	}
}
