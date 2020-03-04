package com.venturedive.project.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.venturedive.project.dto.CustomerDto;
import com.venturedive.project.model.UserDetails;
import com.venturedive.project.model.customer;
import com.venturedive.project.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerrepository;


//	public List<Customer> getAllUsers()
//	{
//		List<Customer> users=new ArrayList<>();
//		customerrepository.findAll().forEach(users::add);
//		return users;
//	}
	public void addUser(CustomerDto user) {
		customer use=new customer(user.getName());
	
	UserDetails userdetails=new UserDetails(user.getEmail(),user.getPassword(),user.getisActive());
		userdetails.setUser(use);
		use.setAddress(userdetails);


		//customerrepository.save(customer);
		customerrepository.save(use);
	}
}
