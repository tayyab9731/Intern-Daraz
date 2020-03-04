package com.venturedive.project.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.venturedive.project.model.customer;

@Repository
public interface CustomerRepository extends CrudRepository<customer, Long>{

	
	

}
