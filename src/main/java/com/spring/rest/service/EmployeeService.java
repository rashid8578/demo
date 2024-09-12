package com.spring.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.model.Employee;
@Service
public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployeeList();
	Employee getEmployee(long id);
	void deleteEmployee(long Id);
	Employee updateEmployee(Employee employee, long id);
}
