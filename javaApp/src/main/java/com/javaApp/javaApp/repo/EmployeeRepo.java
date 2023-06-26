package com.javaApp.javaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaApp.javaApp.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
