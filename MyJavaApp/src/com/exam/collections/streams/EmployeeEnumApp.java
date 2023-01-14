package com.exam.collections.streams;
import java.util.*;
import java.util.stream.*;

import com.exam.collections.streams.EmployeeInfo.SortMethod; 

public class EmployeeEnumApp {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Mickey",100000));
		emps.add(new Employee("Timmy",50000));
		emps.add(new Employee("Annny",40000));
		
		EmployeeInfo info = new EmployeeInfo();
		System.out.println(info.sort(emps, SortMethod.BYNAME));
		System.out.println(info.sort(emps, SortMethod.BYSALARY));
	}
}

class Employee{
	private String name;
	private int salary; 
	
	Employee(){}
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary; 
	}
	
	public String getName(){
		return name;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary; 
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class EmployeeInfo{
	enum SortMethod{
		BYNAME,BYSALARY
	}
	//sort(list,SortMethod.BYNAME )
	public List<Employee> sort(List<Employee> list, final SortMethod method){
		if(method.equals(SortMethod.BYNAME)) {
			List<Employee> sortedListName =
					   list.stream() 
							.sorted(Comparator.comparing(e->e.getName()))
							.collect(Collectors.toList());
			return sortedListName;
		}
		else
		if(method.equals(SortMethod.BYSALARY)) {
			List<Employee> sortedListSalary =  
					list.stream() 
						.sorted(Comparator.comparing(e->e.getSalary()))
						.collect(Collectors.toList());
			return sortedListSalary;
		}
		return list;
	}
	
	public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
		return false;
	}
}

  
