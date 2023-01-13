package com.main.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*; 
import com.main.model.Employee;
 
public class EmployeeService {

	public List<Employee> getList() { //neha
		//add employee objects in the list and return the list 
		/* Creating objects manually */
		Employee e1 = new Employee(1,"harry potter", "london",85000);
		Employee e2 = new Employee(2,"ronald weasley", "kent",75000);
		Employee e3 = new Employee(3,"hermione granger", "london",95000);
		Employee e4 = new Employee(4,"draco malfoy", "manchester",80000);
		Employee e5 = new Employee(5,"neville longbottom", "kent",65000);
		/* Add them in the List */
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		return list;
	}

	public List<Employee> getEmployeesByCity(List<Employee> list,String city ){
		list = list.stream()
				.filter(e->e.getCity().equals(city))
				.collect(Collectors.toList());
		
		return list; 
	}
}
 