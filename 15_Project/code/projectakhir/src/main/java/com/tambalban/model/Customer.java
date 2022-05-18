package com.tambalban.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private int id;
    private String nama_cus;
    private String gender;
    private String kota_cus;
    private String alamat_cus;
    private int nohp_cus;
    private int status_cus;
    private Date created_at;
    private Date updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_cus() {
        return nama_cus;
    }

    public void setNama_cus(String nama_cus) {
        this.nama_cus = nama_cus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getKota_cus() {
        return kota_cus;
    }

    public void setKota_cus(String kota_cus) {
        this.kota_cus = kota_cus;
    }

    public String getAlamat_cus() {
        return alamat_cus;
    }

    public void setAlamat_cus(String alamat_cus) {
        this.alamat_cus = alamat_cus;
    }

    public int getNohp_cus() {
        return nohp_cus;
    }

    public void setNohp_cus(int nohp_cus) {
        this.nohp_cus = nohp_cus;
    }

    public int getStatus_cus() {
        return status_cus;
    }

    public void setStatus_cus(int status_cus) {
        this.status_cus = status_cus;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", nama_cus='" + nama_cus + '\'' +
                ", gender='" + gender + '\'' +
                ", kota_cus='" + kota_cus + '\'' +
                ", alamat_cus='" + alamat_cus + '\'' +
                ", nohp_cus=" + nohp_cus +
                ", status_cus=" + status_cus +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
