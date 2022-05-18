package com.tambalban.service;


import com.tambalban.model.DetailTransaksi;
import com.tambalban.repository.DetailTransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailTransaksiService {
    @Autowired
    private DetailTransaksiRepository repository;

    public DetailTransaksi saveDetail(DetailTransaksi detailTransaksi){
        return repository.save(detailTransaksi);
    }

    public List<DetailTransaksi> getDetails(){
        return repository.findAll();
    }

    public DetailTransaksi getDetailById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteDetail(int id){
        repository.deleteById(id);
        return "Detail Transaksi dengan id :" + id + "terhapus";
    }


}
