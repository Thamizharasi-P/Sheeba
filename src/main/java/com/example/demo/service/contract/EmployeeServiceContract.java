package com.example.demo.service.contract;

import com.example.demo.model.Employee;

public interface EmployeeServiceContract {
    Employee[] GetAllEmployees();

    Employee GetEmployeeById(int id);

    void Create(int id, String name, int age);
}
