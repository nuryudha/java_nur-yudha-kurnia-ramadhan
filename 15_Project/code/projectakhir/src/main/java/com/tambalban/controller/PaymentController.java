package com.tambalban.controller;

import com.tambalban.model.Payment;
import com.tambalban.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService service;

    @PostMapping("/addPayment")
    public Payment addProduct(@RequestBody Payment payment){
        return service.savePayment(payment);
    }

    @GetMapping("/jenisPayments")
    public List<Payment> findAllPayment(){
        return service.getPayments();
    }

    @DeleteMapping("/Payment/delete/{id}")
    public String deletePayment(@PathVariable int id){
        return service.deletePayment(id);
    }
}
