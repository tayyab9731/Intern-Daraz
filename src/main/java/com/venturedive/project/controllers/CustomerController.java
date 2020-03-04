package com.venturedive.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.venturedive.project.dto.CustomerDto;
import com.venturedive.project.model.UserDetails;
import com.venturedive.project.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	public CustomerService customerservice;

//	@RequestMapping("/Users")
//	public List<Customer> getAll() {
//		return customerservice.getAllUsers();
//	}

	@PostMapping(value = "/user")
	public void addUser(@RequestBody CustomerDto user) {
		
		customerservice.addUser(user);
	}
}
