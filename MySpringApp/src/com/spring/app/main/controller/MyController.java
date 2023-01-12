package com.spring.app.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	//IoC: Inversion of Control 
	@RequestMapping("/")
	public String showDashboard() {
		return "WEB-INF/jsps/dashboard.jsp";
	}
	
	@RequestMapping("/employees")
	public String showEmployees(Model model) { //dependency injection
		//I want to pass some data to employees.jsp
		model.addAttribute("msg", "hello");
		model.addAttribute("price", 20000.0);
		return "WEB-INF/jsps/employees.jsp";
	}
	 
	@RequestMapping("/colleges")
	public String showColleges(HttpServletRequest request) { 
		request.setAttribute("collegeName", "ABC Institute of Tech");
		return "WEB-INF/jsps/colleges.jsp";
	}
	
	@RequestMapping("/students")
	public ModelAndView showStudents(ModelAndView mav) {
		mav.addObject("sname", "Harry Potter"); 
		mav.setViewName("WEB-INF/jsps/students.jsp");
		return mav; 
		
	}
}
