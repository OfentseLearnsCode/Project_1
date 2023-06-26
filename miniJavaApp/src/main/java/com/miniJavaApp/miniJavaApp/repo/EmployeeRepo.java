package com.miniJavaApp.miniJavaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniJavaApp.miniJavaApp.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
