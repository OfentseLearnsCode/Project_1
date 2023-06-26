package com.miniJavaApp.miniJavaApp.models;

public class Employee {
    public int empId;
    public String empName;
    public String empSurname;
    public String empEmail;
    public String empPhone;
    public String empDepartment;


public Employee(int empId, String empName, String empSurname, String empEmail, String empPhone, String empDepartment) {
    this.empId = empId;
    this.empName = empName;
    this.empSurname = empSurname;
    this.empEmail = empEmail;
    this.empPhone = empPhone;
    this.empDepartment = empDepartment;
}
public int getempId() {
    return empId;
}
public void setempId(int empId) {
    this.empId = empId;
}
public String getEmpName() {
    return empName;
}
public void setEmpName(String empName) {
    this.empName = empName;
}]
public String getEmpSurname() {
    return empSurname;
}
public void setEmpSurname(String empSurname) {
    this.empSurname = empSurname;
}
public String getEmpEmail(String empEmail) {
    return empEmail;
}
public void setEmpEmail(String empEmail) {
    this.empEmail = empEmail;
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