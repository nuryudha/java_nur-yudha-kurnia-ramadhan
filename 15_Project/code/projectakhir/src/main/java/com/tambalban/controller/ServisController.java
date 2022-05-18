package com.tambalban.controller;

import com.tambalban.model.Servis;
import com.tambalban.service.ServisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServisController {

    @Autowired
    private ServisService service;

    @PostMapping("/addJenisServis")
    public Servis addJenisServis(@RequestBody Servis servis){
        return service.saveServis(servis);
    }

    @GetMapping("/tampilBanyakServis")
    public List<Servis> findAllBanyakServis(){
        return service.getBanyakServis();
    }

    @GetMapping("/servisById/{id}")
    public Servis findServisById(@PathVariable int id){
        return service.getServisById(id);
    }

    @PutMapping("/update/servis")
    public Servis updateServis(@RequestBody Servis servis){
        return service.updateServis(servis);
    }

    @DeleteMapping("/servis/delete/{id}")
    public String deleteServis(@PathVariable int id){
        return service.deleteServis(id);
    }
}
