package com.example.demo.service.implementation;

import com.example.demo.model.Employee;
import com.example.demo.service.contract.EmployeeServiceContract;

public class EmployeeService implements EmployeeServiceContract {

    private Employee[] _employees;


    public EmployeeService() {
        Employee employee1 = new Employee(1, "Sheeba");
        Employee employee2 = new Employee(2, "Vel");
        Employee employee3 = new Employee(3, "Thamizh");

        _employees = new Employee[]{employee1, employee2, employee3};
    }

    public Employee[] GetAllEmployees() {

        return _employees;
    }

    public Employee GetEmployeeById(int id) {
        for (Employee emp : _employees) {
            if (id == emp.Id) {
                return emp;
            }
        }
        return null;
    }


}
