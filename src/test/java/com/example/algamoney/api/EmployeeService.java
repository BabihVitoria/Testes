package com.example.algamoney.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.example.algamoney.api.model.Employee;

public class EmployeeService {
	
	@Test
	public void whenValidName_thenEmployeeShouldBeFound(Object employeeService) {
	    String name = "alex";
	    Employee found = employeeService.getEmployeeByName(name);
	  
	     assertThat(found.getName())
	      .isEqualTo(name);
	 }
}
