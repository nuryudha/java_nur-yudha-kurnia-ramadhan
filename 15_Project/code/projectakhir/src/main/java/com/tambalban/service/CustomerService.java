package com.tambalban.service;

import com.tambalban.model.Customer;
import com.tambalban.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer){

        return repository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> customers) {

        return repository.saveAll(customers);
    }

    public List<Customer> getCustomers(){
        return  repository.findAll();
    }

    public Customer getCustomerById(int id){

        return repository.findById(id).orElse(null);
    }

    public String deleteCustomer(int id){
        repository.deleteById(id);
        return "Customer" + id + "terhapus";
    }

    public Customer updateCustomer(Customer customer){
        Customer existingCustomer = repository.findById(customer.getId()).orElse(null);
                existingCustomer.setNama_cus(customer.getNama_cus());
                existingCustomer.setGender(customer.getGender());
                existingCustomer.setKota_cus(customer.getKota_cus());
                existingCustomer.setAlamat_cus(customer.getAlamat_cus());
                existingCustomer.setNohp_cus(customer.getNohp_cus());
                existingCustomer.setKota_cus(customer.getKota_cus());
                existingCustomer.setStatus_cus(customer.getStatus_cus());

        return repository.save(existingCustomer);
    }


}
