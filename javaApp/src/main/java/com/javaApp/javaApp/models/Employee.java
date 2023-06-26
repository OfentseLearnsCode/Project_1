package com.javaApp.javaApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    private int empId;
    private String empName;
    private String empSurname;
    private String empPhone;
    private String empDepartment;

public Employee() {
    
}

public Employee(int empId, String empName, String empSurname, String empEmail, String empPhone, String empDepartment) {
    this.empId = empId;
    this.empName = empName;
    this.empSurname = empSurname;
    this.empPhone = empPhone;
    this.empDepartment = empDepartment;
}
@Id
@GeneratedValue
public int getEmpId() {
    return empId;
}
public void setEmpId(int empId) {
    this.empId = empId;
}
public String getEmpName() {
    return empName;
}
public void setEmpName(String empName) {
    this.empName = empName;
}
public String getEmpSurname() {
    return empSurname;
}
public void setEmpSurname(String empSurname) {
    this.empSurname = empSurname;
}
public String getEmpPhone() {
    return empPhone;
}
public void setEmpPhone(String empPhone) {
    this.empPhone = empPhone;
}
public String getEmpDepartment() {
    return empDepartment;
}
public void setEmpDepartment(String empDepartment) {
    this.empDepartment = empDepartment;
}
}