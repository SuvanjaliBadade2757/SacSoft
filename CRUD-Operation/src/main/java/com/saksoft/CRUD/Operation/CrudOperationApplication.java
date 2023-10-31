package com.saksoft.CRUD.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.saksoft.CRUD.Operation.entity.Employee;
import com.saksoft.CRUD.Operation.service.EmployeeService;

@EnableWebMvc
@SpringBootApplication
public class CrudOperationApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationApplication.class, args);
		System.out.println("Hello its running the application");
	}
	
	

}
