package com.venturedive.project.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.venturedive.project.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	
	

}
