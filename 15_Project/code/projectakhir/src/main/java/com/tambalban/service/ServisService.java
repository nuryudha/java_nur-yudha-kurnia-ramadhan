package com.tambalban.service;

import com.tambalban.model.Servis;
import com.tambalban.repository.ServisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServisService {
    @Autowired
    private ServisRepository repository;

    public Servis saveServis(Servis servis){
        return repository.save(servis);
    }

    public List<Servis> getBanyakServis(){
        return repository.findAll();
    }

    public Servis getServisById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteServis(int id){
        repository.deleteById(id);
        return "Servis telah dihapus" + id;
    }

    public Servis updateServis(Servis servis){
        Servis existingServis = repository.findById(servis.getId()).orElse(null);
        existingServis.setJenis_servis(servis.getJenis_servis());
        existingServis.setPrice(servis.getPrice());

        return repository.save(existingServis);
    }
}
