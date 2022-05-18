package com.tambalban.controller;

import com.tambalban.model.Customer;
import com.tambalban.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers){
        return  service.saveCustomers(customers);
    }

    @GetMapping("/Customers")
    public List<Customer> findAllCustomers(){
        return service.getCustomers();
    }

    @GetMapping("/CustomerById/{id}")
    public Customer findCustomerById(@PathVariable int id){
        return service.getCustomerById(id);
    }

    @DeleteMapping("/Customer/delete/{id}")
    public String deleteCustomer(@PathVariable int id){
        return service.deleteCustomer(id);
    }

    @PutMapping("/update/Customer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return service.updateCustomer(customer);
    }
}
