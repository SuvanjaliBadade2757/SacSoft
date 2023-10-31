package com.saksoft.CRUD.Operation.respository;

import org.springframework.data.repository.CrudRepository;

import com.saksoft.CRUD.Operation.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
