package com.assignment.task.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.task.payloads.ApiResponse;
import com.assignment.task.payloads.EmployeeDto;
import com.assignment.task.services.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
		EmployeeDto newEmployeeDto = this.employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(newEmployeeDto , HttpStatus.CREATED);
	}
	
	@PutMapping("/{empId}")
	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto , @PathVariable Integer empId){
		EmployeeDto newEmployeeDto = this.employeeService.updateEmployee(employeeDto, empId);
		return ResponseEntity.ok(newEmployeeDto);
	}
	
	@DeleteMapping("/{empId}")
	public ResponseEntity<ApiResponse> deleteEmployee(@PathVariable("empId") Integer eId){
		this.employeeService.deleteEmployee(eId);
		return new ResponseEntity<>(new ApiResponse(" Employee is deleted Successfully " , true), HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
		List<EmployeeDto> allEmployee = this.employeeService.getAllEmployee();
		return ResponseEntity.ok(allEmployee);
	}
	
	@GetMapping("/{empId}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Integer empId){
		EmployeeDto empDto = this.employeeService.getEmployeeById(empId);
		return new ResponseEntity<>(empDto , HttpStatus.OK);		
	}
	
}
