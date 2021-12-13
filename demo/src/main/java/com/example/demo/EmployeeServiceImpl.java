package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override public String addEmployee(EmployeeInput employeeInput) {
        return null;

    }

    @Override public Employee getEmployeeById(String id) {
        return null;
    }

    @Override public Employee updateEmployee(String id, EmployeeInput employeeInput) {
        return null;

    }

    @Override public void deleteEmployee(String id) {

    }
}
