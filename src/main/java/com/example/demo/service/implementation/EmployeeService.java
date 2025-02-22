package com.example.demo.service.implementation;

import com.example.demo.model.Employee;
import com.example.demo.service.contract.EmployeeServiceContract;

import java.util.ArrayList;

public class EmployeeService implements EmployeeServiceContract {

    private ArrayList<Employee> _employees;


    public EmployeeService() {
        Employee employee1 = new Employee(1, "Sheeba");
        Employee employee2 = new Employee(2, "Vel");
        Employee employee3 = new Employee(3, "Thamizh");

        _employees = new ArrayList<Employee>();
        _employees.add(employee1);
        _employees.add(employee2);
        _employees.add(employee3);
    }

    public Employee[] GetAllEmployees() {
        Employee[] employees = new Employee[_employees.size()];
        return _employees.toArray(employees);
    }

    public Employee GetEmployeeById(int id) {
        for (Employee emp : _employees) {
            if (id == emp.Id) {
                return emp;
            }
        }
        return null;
    }

    public void Create(int id, String name, int age) {

        for (Employee empl : _employees) {
            if (id != empl.Id) {
                Employee employee = new Employee(id, name);
                _employees.add(employee);
            } else {

            }
        }

    }


}

