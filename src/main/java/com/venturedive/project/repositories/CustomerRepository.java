package com.venturedive.project.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.venturedive.project.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	
	

}
