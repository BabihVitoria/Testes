package com.example.algamoney.api.repository;

import org.aspectj.lang.annotation.Before;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algamoney.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 
    public Employee findByName(String name);
    
    @Before(value = "")
    public static Employee setUp() {
        Employee alex = new Employee("alex");
     
        EmployeeRepository employeeRepository = null;
		Mockito.when(employeeRepository.findByName(alex.getName()));
          return(alex);
    }
}

