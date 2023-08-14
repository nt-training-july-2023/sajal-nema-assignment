package com.assignment.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.task.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
