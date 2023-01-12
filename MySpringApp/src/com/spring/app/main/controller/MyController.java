package com.spring.app.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.app.main.model.Employee;
import com.spring.app.main.service.EmployeeService;

@Controller
public class MyController {
	//IoC: Inversion of Control 
	@RequestMapping("/")
	public String showDashboard() {
		return "WEB-INF/jsps/dashboard.jsp";
	}
	
	@RequestMapping("/employees")
	public String showEmployees(Model model, EmployeeService employeeService) { //dependency injection
		//I want to pass some data to employees.jsp
		model.addAttribute("msg", "hello");
		model.addAttribute("price", 20000.0);
		Integer[] iarry = new Integer[]{1,2,3,4,5,6,7};
		model.addAttribute("iarry", iarry);
		
		List<Employee> list = employeeService.getList();
		model.addAttribute("list", list);
		
		return "WEB-INF/jsps/employees.jsp";
	}
	 
	@RequestMapping("/colleges")
	public String showColleges(HttpServletRequest request) { 
		request.setAttribute("collegeName", "ABC Institute of Tech");
		String[] sarry = new String[]
				{"ABC Institute","PQR Institute"};
		request.setAttribute("sarry", sarry);
		return "WEB-INF/jsps/colleges.jsp";
	}
	
	@RequestMapping("/students")
	public ModelAndView showStudents(ModelAndView mav) {
		mav.addObject("sname", "Harry Potter"); 
		mav.setViewName("WEB-INF/jsps/students.jsp");
		
		List<String> list = new ArrayList<>();
		list.add("ronald weasley");
		list.add("hermione granger");
		
		mav.addObject("slist", list);
		return mav; 
		
	}
}
