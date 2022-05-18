package com.tambalban.service;

import com.tambalban.model.DetailService;
import com.tambalban.repository.DetailServisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceService {
    @Autowired
    private DetailServisRepository repository;

   public DetailService saveDetailServis(DetailService detailService){
       return repository.save(detailService);
   }

    public List<DetailService> getDetailServis(){
        return repository.findAll();
    }

    public DetailService getDetailServisById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteDetailServis(int id){
        repository.deleteById(id);
        return "Detail Servis dengan id :" + id + "terhapus";
    }

}
