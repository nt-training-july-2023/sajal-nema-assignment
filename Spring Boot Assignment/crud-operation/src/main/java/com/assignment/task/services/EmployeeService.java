package com.assignment.task.services;

import java.util.List;


import com.assignment.task.payloads.EmployeeDto;

public interface EmployeeService {
	
//	Create
	EmployeeDto createEmployee(EmployeeDto employee);
	
//	Update Employee By Id
	EmployeeDto updateEmployee(EmployeeDto employee , Integer employeeId);
	
//	Delete Employee By Id
	void deleteEmployee(Integer employeeId);
	
//	GetAll
	List<EmployeeDto> getAllEmployee();
	
//	Get Employee By Id
	EmployeeDto getEmployeeById(Integer employeeId);
}
