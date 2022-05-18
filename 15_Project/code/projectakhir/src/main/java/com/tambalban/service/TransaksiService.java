package com.tambalban.service;

import com.tambalban.model.Transaksi;
import com.tambalban.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TransaksiService {
    @Autowired
    private TransaksiRepository repository;

    public Transaksi saveTransaksi(Transaksi transaksi) {
        return repository.save(transaksi);
    }

    public List<Transaksi> getTransaksis() {
        return repository.findAll();
    }

    public Transaksi getTransaksiById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteTransaksi(int id) {
        repository.deleteById(id);
        return "Transaksi " + id + "Terhapus";
    }

}
