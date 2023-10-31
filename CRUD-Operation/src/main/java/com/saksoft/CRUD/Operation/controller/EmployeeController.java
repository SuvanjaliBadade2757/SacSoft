package com.saksoft.CRUD.Operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.CRUD.Operation.entity.Employee;
import com.saksoft.CRUD.Operation.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeServie;
	
	@GetMapping("/employee")
	public List<Employee> getAllBooks(){
		
		return employeeServie.getAllemployee();
		
	}
	
	@PostMapping("/save/employee")
	public int saveEmployee(@RequestBody Employee employee) {
		System.out.println("Employee Name  : " + employee.getFirstName());
		return employeeServie.save(employee);
	}
	
		
	@PutMapping("/update/employee")
	public int updateEmployee(@RequestBody Employee employee) {
		return employeeServie.update(employee);
	}
	
	@DeleteMapping("/delete/employee/{employeeid}")
	public void deleteEmployee(@PathVariable("employeeid") int employeeid) {
		employeeServie.deleteEmployeeById(employeeid);
	}
	

}
