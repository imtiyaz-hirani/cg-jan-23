package com.bootapp.rest.restapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootapp.rest.restapp.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Integer>{

}
