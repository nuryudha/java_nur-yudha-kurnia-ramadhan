package com.tambalban.controller;



import com.tambalban.model.DetailTransaksi;
import com.tambalban.service.DetailTransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailTransaksiController {
    @Autowired
    private DetailTransaksiService service;

    @PostMapping("/addDetailTransaksi")
    public DetailTransaksi addDetail(@RequestBody DetailTransaksi detailTransaksi) {
        return service.saveDetail(detailTransaksi);
    }

    @GetMapping("/detailsTransaksi")
    public List<DetailTransaksi> findAllDetails() {
        return service.getDetails();
    }

    @GetMapping("/detailTransaksiById/{id}")
    public DetailTransaksi findDetailById(@PathVariable int id){
        return service.getDetailById(id);
    }


    @DeleteMapping("/detailTransaksi/delete/{id}")
    public String deleteDetail(@PathVariable int id){
        return service.deleteDetail(id);
    }
}
