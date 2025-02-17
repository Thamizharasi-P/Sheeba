package com.example.demo.model;

import java.time.LocalDate;

public class Employee {
    public int Id;
    public String Name;
    public int Age;
    public String Department;
    public long Salary;
    public LocalDate DateOfBirth;

    public Employee(int id, String name) {
        Id = id;
        Name = name;
    }


}
