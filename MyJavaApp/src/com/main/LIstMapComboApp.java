package com.main;

import java.util.*;
import java.util.stream.*;

import com.main.model.Employee;
import com.main.service.EmployeeService;

public class LIstMapComboApp {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService(); 
		List<Employee> list = service.getList(); //e1,e2,e3,e4,e5
		
		/* From the given List, Prepare following info: 
		   Sample Output: 
		   { pune=2, mumbai=3, bangalore=5} 
		 */
		Map<String,Long> outputMap = new HashMap<>();
		
		List<String> listCities =  list.stream() 
										.map(e->e.getCity())
										.distinct()
										.collect(Collectors.toList());
		
		for(String c : listCities) { //c=london  c=kent  c=manchester
			long count = list.stream() 
								.filter(e->e.getCity().equals(c))
								.count();
			outputMap.put(c, count);
		}
		System.out.println(outputMap);
	} 
}