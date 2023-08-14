package com.assignment.task.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int age;
	
	@Id
	@Column(name = "id" , nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	@Column(name = "address" , nullable = false)
	private String empAddress;
	
	@Column(name = "phoneNumber" , nullable = false)
	private String phnNumber;
	
	@Column(name = "email" , nullable = false , unique = true)
	private String emailAddress;
}
