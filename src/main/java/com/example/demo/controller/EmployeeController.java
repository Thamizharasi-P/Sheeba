package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.contract.EmployeeServiceContract;
import com.example.demo.service.implementation.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/get-all-employee")
    public Employee[] getAllEmployees() {
        EmployeeService employeeservice = new EmployeeService();
        Employee[] employees = employeeservice.GetAllEmployees();
        return employees;
    }
}
