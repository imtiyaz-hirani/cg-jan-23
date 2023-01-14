package com.main;

import java.util.List;
import java.util.stream.Collectors;

import com.main.model.Employee;
import com.main.service.EmployeeService;

public class StreamsMap {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService(); 
		List<Employee> list = service.getList(); //e1,e2,e3,e4,e5
		
		list.stream().forEach(System.out :: println);  //e=e1, e=e2, e=e3, e=e4, e=e5
		
		/* Create a List having only salary of the employees */
		System.out.println("----List of Salaries----");
		List<Double> salaryList = list.stream()
									.map(e->e.getSalary())
									.collect(Collectors.toList()); 
		
		salaryList.stream().forEach(System.out :: println);
		
		/* Create a List having only cities of employees */
		System.out.println("----List of Cities----");
		List<String> listCity =  list.stream()
									.map(e->e.getCity())
									.collect(Collectors.toList());
		
		listCity.stream().forEach(System.out::println);
		
		/* Create a List having only IDs of the employees*/
	}
}
