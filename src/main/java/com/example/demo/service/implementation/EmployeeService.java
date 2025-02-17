package com.example.demo.service.implementation;

import com.example.demo.model.Employee;
import com.example.demo.service.contract.EmployeeServiceContract;

public class EmployeeService implements EmployeeServiceContract {

    public Employee[] GetAllEmployees() {
        Employee employee1 = new Employee(1, "Sheeba");
        Employee employee2 = new Employee(2, "Vel");
        Employee employee3 = new Employee(3, "Thamizh");

        return new Employee[]{employee1, employee2, employee3};
    }
}
