package com.tambalban.controller;

import com.tambalban.model.DetailService;
import com.tambalban.service.DetailServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailServisController {
    @Autowired
    private DetailServiceService service;

    @PostMapping("/addDetailServis")
    public DetailService addDetailServis(@RequestBody DetailService detailService){
        return service.saveDetailServis(detailService);
    }

    @GetMapping("/DetailServis/semua")
    public List<DetailService> findAllDetailServis(){
        return service.getDetailServis();
    }

    @GetMapping("/DetailServisById/{id}")
    public DetailService findDetailServisById(@PathVariable int id){
        return service.getDetailServisById(id);
    }


    @DeleteMapping("/DetailServis/delete/{id}")
    public String deleteDetailServis(@PathVariable int id){
        return service.deleteDetailServis(id);
    }
}
