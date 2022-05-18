package com.tambalban.service;


import com.tambalban.model.Employee;
import com.tambalban.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {

        return repository.saveAll(employees);
    }

    public List<Employee> getEmployees(){
        return  repository.findAll();
    }

    public Employee getEmployeeById(int id){

        return repository.findById(id).orElse(null);
    }

    public String deleteEmployee(int id){
        repository.deleteById(id);
        return "Employee" + id + "terhapus";
    }

    public Employee updateEmployee(Employee employee){
        Employee existingCustomer = repository.findById(employee.getId()).orElse(null);
        existingCustomer.setNama_peg(employee.getNama_peg());
        existingCustomer.setGender_peg(employee.getGender_peg());
        existingCustomer.setKota_peg(employee.getKota_peg());
        existingCustomer.setAlamat_peg(employee.getAlamat_peg());
        existingCustomer.setNohp_peg(employee.getNohp_peg());
        existingCustomer.setKota_peg(employee.getKota_peg());
        existingCustomer.setStatus_peg(employee.getStatus_peg());

        return repository.save(existingCustomer);
    }
}
