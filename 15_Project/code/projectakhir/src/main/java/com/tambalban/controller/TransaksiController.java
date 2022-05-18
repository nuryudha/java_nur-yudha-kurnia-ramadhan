package com.tambalban.controller;

import com.tambalban.model.Transaksi;
import com.tambalban.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransaksiController {
    @Autowired
    private TransaksiService service;

    @PostMapping("/addTransaksi")
    public Transaksi addTransaksi(@RequestBody Transaksi transaksi) {
        return service.saveTransaksi(transaksi);
    }

    @GetMapping("/TampilTransaksi")
    public List<Transaksi> findAllTransaksis() {
        return service.getTransaksis();
    }

    @GetMapping("/TransaksiById/{id}")
    public Transaksi findTransaksiById(@PathVariable int id) {
        return service.getTransaksiById(id);
    }

    @DeleteMapping("/Transaksi/delete/{id}")
    public String deleteTransaksi(@PathVariable int id) {
        return service.deleteTransaksi(id);
    }


}
