package com.assignment.task.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.task.entities.Employee;
import com.assignment.task.exceptions.ResourceNotFoundException;
import com.assignment.task.payloads.EmployeeDto;
import com.assignment.task.repositories.EmployeeRepo;
import com.assignment.task.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public EmployeeDto createEmployee(EmployeeDto employee) {
		Employee emp = this.modelMapper.map(employee , Employee.class);
		Employee SavedEmp = this.employeeRepo.save(emp);
		return this.modelMapper.map(SavedEmp , EmployeeDto.class);
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employee, Integer employeeId) {	
		Employee emp = this.employeeRepo.findById(employeeId).orElseThrow(()-> new ResourceNotFoundException("Employee" , " employeeID " , employeeId));
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setEmailAddress(employee.getEmailAddress());
		emp.setEmpAddress(employee.getEmpAddress());
		emp.setPhnNumber(employee.getPhnNumber());
		Employee updatedEmployee = this.employeeRepo.save(emp);
		return this.modelMapper.map(updatedEmployee, EmployeeDto.class);
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		Employee emp = this.employeeRepo.findById(employeeId).orElseThrow(()-> new ResourceNotFoundException("Employee" , " EmployeeID " , employeeId));
		this.employeeRepo.deleteById(employeeId);
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		List<Employee> empList = this.employeeRepo.findAll();
		List<EmployeeDto> employeeDto = empList.stream().map(emp -> this.modelMapper.map(emp , EmployeeDto.class)).collect(Collectors.toList());
		return employeeDto;
	}

	@Override
	public EmployeeDto getEmployeeById(Integer employeeId) {
	    Employee emp = this.employeeRepo.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee", " EmployeeID ", employeeId));
	    EmployeeDto empDto = this.modelMapper.map(emp, EmployeeDto.class);
		return empDto;
	}

}
