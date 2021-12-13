package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override public String addEmployee(EmployeeInput employeeInput) {

    }

    @Override public Employee getEmployeeById(String id) {

    }

    @Override public Employee updateEmployee(String id, EmployeeInput employeeInput) {

    }

    @Override public void deleteEmployee(String id) {

    }
}
