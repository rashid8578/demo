package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.model.Employee;
import com.spring.rest.service.EmployeeService;

@RestController
//@RequestMapping("/")
public class EmloyeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployeeList();
	}
	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
		
		@PutMapping("/employees/{id}")
	    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable long id) {
	        return employeeService.updateEmployee(employee, id);
	    }
		
	    @DeleteMapping("/employees/{id}")
	    public void deleteEmployee(@PathVariable long id) {
	        employeeService.deleteEmployee(id);
	    }
	
}
