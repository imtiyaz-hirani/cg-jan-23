package com.spring.app.main.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.app.main.model.Employee;
import com.spring.app.main.service.EmployeeService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private  EmployeeService employeeService; //Dependency Injection
	
	@RequestMapping(value = "/api/hello",method = RequestMethod.GET )
	public String helloApi() {
		return "Hello Rest Api";
	}
	
	/* API that takes marks and returns grade based on percent scored. 
	 	marks_secured(marks) = <input>
	 	total_marks = 500
	  	percent = (marks * 100) / 500 
	  	
	  	percent > 75 : A 
	  	>60 : B 
	  		: C
	  */
	@RequestMapping(value="/api/grade/{marks}", method = RequestMethod.GET)
	public String computeGradeAPi(@PathVariable("marks") double marks) { //marks = 450
		double totalMarks = 500; 
		double percent = (marks * 100) / totalMarks ; 
		
		String grade = percent>75?"A":percent>60?"B":"C"; 
		return grade; 
	}
	//api/grade/450
	// Is the variable(marks) defined in Path, accessible inside method???  NO
	
	
	/* Return all Employees as List */
	@RequestMapping(value="/api/employees/all", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		List<Employee> list = employeeService.getList();
		return list; 
	}
	
	/* Fetch Employee Details on the basis of employee id given */
	@RequestMapping(value="/api/employee/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<Object> getEmployeeById(@PathVariable("id") int id) {
		List<Employee> list = employeeService.getList();
		Employee employee = null; 
		for(Employee e : list) {
			if(e.getId() == id) {
				employee = e; 
				break; 
			}
		}
		if(employee == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ID Given");
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(employee);
		}
		
	}
	
	
}
