package com.spring.app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	static {
		System.out.println("controller....");
	}
	
	@RequestMapping("/")
	public String showDashboard() {
		return "WEB-INF/jsps/dashboard.jsp";
	}
	
	@RequestMapping("/employees")
	public String showEmployees() {
		return "WEB-INF/jsps/employees.jsp";
	}
	
	@RequestMapping("/colleges")
	public String showColleges() { 
		return "WEB-INF/jsps/colleges.jsp";
	}
	
	@RequestMapping("/students")
	public String showStudents() {
		return "WEB-INF/jsps/students.jsp";
	}
}
