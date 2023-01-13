package com.main;

import java.util.List;

import com.main.model.Employee;
import com.main.service.EmployeeService;

public class App { //praveen
	public static void main(String[] args) {
		EmployeeService employeeService 
			= new EmployeeService();
		
		List<Employee> list = employeeService.getList();
		
		for(Employee e :list ) { //e = e1 |  e = e2   | e=e3  | e=e4 | e=e5  
			System.out.println(e.getName() + "  " + e.getSalary());
		}
		System.out.println("---------Filter by city-------------");
		/* Filter List on the basis of employee city */
		String city="madrid";
		List<Employee> flistByCity = employeeService.getEmployeesByCity(list,city);
		for(Employee e :flistByCity ) { //e = e1 |  e = e2   | e=e3  | e=e4 | e=e5  
			System.out.println(e.getName() + "  " + e.getCity());
		}
		
	}
}
