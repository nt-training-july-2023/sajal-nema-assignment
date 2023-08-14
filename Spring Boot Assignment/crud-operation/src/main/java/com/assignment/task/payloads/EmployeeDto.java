package com.assignment.task.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {
	private String name;

	private int age;

	private String empAddress;

	private String phnNumber;

	private String emailAddress;
}
