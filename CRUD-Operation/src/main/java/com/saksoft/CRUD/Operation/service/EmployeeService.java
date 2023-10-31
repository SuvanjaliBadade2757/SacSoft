package com.saksoft.CRUD.Operation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.CRUD.Operation.entity.Employee;
import com.saksoft.CRUD.Operation.respository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllemployee() {
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return employees;
	}
	
	public int save(Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee.getId();
	}
	
	public int update(Employee employee) {
		return save(employee);
	}

	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
	}
}
