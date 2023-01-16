package com.bootapp.rest.restapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootapp.rest.restapp.data.EmployeeRespository;
import com.bootapp.rest.restapp.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRespository employeeRepository; 
	
	public void postEmployee(Employee employee) {
		// save employee in DB 
		employeeRepository.save(employee);
		
	}

}
