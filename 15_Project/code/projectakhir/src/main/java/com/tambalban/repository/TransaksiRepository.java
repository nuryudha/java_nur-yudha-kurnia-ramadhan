package com.tambalban.repository;

import com.tambalban.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepository extends JpaRepository<Transaksi,Integer> {
}
