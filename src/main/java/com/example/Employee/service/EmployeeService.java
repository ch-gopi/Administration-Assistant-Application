package com.example.Employee.service;

import com.example.Employee.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList= Arrays.asList(
            new Employee(1,"Gopi","HYDERABAD"),
            new Employee(2,"Muneer","HYDERABAD")

    );

    public  List<Employee> getAllEmployees()
    {
        return  employeeList;
    }}