package com.tambalban.controller;


import com.tambalban.model.Employee;
import com.tambalban.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees){
        return  service.saveEmployees(employees);
    }

    @GetMapping("/Employees")
    public List<Employee> findAllEmployees(){
        return service.getEmployees();
    }

    @GetMapping("/EmployeeById/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    @DeleteMapping("/Employee/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        return service.deleteEmployee(id);
    }

    @PutMapping("/update/Employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }
}
