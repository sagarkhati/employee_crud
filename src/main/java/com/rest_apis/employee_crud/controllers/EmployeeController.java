package com.rest_apis.employee_crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest_apis.employee_crud.entities.Employee;
import com.rest_apis.employee_crud.repos.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;

	@GetMapping("/books")
	public List<Employee> getAllBooks() {
		return empRepo.findAll();
	}
}
