package com.example.Employee.controller;

import com.example.Employee.Entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
//@RestController
public class EmployeeController {
    @RequestMapping("/employees")
     public List<Employee> findallemployees(){
         List<Employee> EmployeeList= Arrays.asList(
                 new Employee(1,"Gopi","HYDERABAD"),
                 new Employee(2,"Muneer","HYDERABAD")

         );

         return EmployeeList;
    }
}
