package com.saksoft.CRUD.Operation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id ;
	@Column(name = "FirstName")
	private String FirstName ;
	@Column(name = "LastName")
	private String LastName ;
	@Column(name = "Email")
	private String Email ;
	@Column(name = "Age")
	private int Age ;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Age=" + Age + "]";
	}
	


}
