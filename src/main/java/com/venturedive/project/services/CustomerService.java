package com.venturedive.project.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.venturedive.project.dto.CustomerDto;
import com.venturedive.project.model.CustomerDetail;
import com.venturedive.project.model.Customer;
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
		Customer use=new Customer(user.getName());
	
	CustomerDetail userdetails=new CustomerDetail(user.getEmail(),user.getPassword(),user.getisActive());
		userdetails.setUser(use);
		use.setAddress(userdetails);


		//customerrepository.save(customer);
		customerrepository.save(use);
	}
}
