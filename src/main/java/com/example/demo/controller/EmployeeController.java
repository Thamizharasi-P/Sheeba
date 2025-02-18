package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.contract.EmployeeServiceContract;
import com.example.demo.service.implementation.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

    private final EmployeeService _employeeService;

    public EmployeeController() {
        _employeeService = new EmployeeService();
    }


    @GetMapping("/get-all-employee")
    public Employee[] getAllEmployees() {
        Employee[] employees = _employeeService.GetAllEmployees();
        return employees;
    }

    @GetMapping("/get-employee-by-id")
    public Employee getEmployeeById(@RequestParam(value = "id") int id) {
        Employee employee = _employeeService.GetEmployeeById(id);
        return employee;
    }

}
