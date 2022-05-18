package com.tambalban.service;

import com.tambalban.model.Payment;
import com.tambalban.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment savePayment(Payment payment){
        return repository.save(payment);
    }

    public List<Payment> getPayments(){
        return repository.findAll();
    }

    public String deletePayment(int id){
        repository.deleteById(id);
        return "payment terhapus" + id;
    }
}
