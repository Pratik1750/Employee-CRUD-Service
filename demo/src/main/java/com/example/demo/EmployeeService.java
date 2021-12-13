package com.example.demo;

public interface EmployeeService {

    String addEmployee(EmployeeInput employeeInput);

    Employee getEmployeeById(String id);

    Employee updateEmployee(String id, EmployeeInput employeeInput);

    void deleteEmployee(String id);

}
