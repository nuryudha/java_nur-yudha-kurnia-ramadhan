package com.tambalban.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private int id;
    private String nama_peg;
    private String gender_peg;
    private String kota_peg;
    private String alamat_peg;
    private int nohp_peg;
    private int status_peg;
    private Date created_at;
    private Date updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_peg() {
        return nama_peg;
    }

    public void setNama_peg(String nama_peg) {
        this.nama_peg = nama_peg;
    }

    public String getGender_peg() {
        return gender_peg;
    }

    public void setGender_peg(String gender_peg) {
        this.gender_peg = gender_peg;
    }

    public String getKota_peg() {
        return kota_peg;
    }

    public void setKota_peg(String kota_peg) {
        this.kota_peg = kota_peg;
    }

    public String getAlamat_peg() {
        return alamat_peg;
    }

    public void setAlamat_peg(String alamat_peg) {
        this.alamat_peg = alamat_peg;
    }

    public int getNohp_peg() {
        return nohp_peg;
    }

    public void setNohp_peg(int nohp_peg) {
        this.nohp_peg = nohp_peg;
    }

    public int getStatus_peg() {
        return status_peg;
    }

    public void setStatus_peg(int status_peg) {
        this.status_peg = status_peg;
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
        return "Pegawai{" +
                "id=" + id +
                ", nama_peg='" + nama_peg + '\'' +
                ", gender_peg='" + gender_peg + '\'' +
                ", kota_peg='" + kota_peg + '\'' +
                ", alamat_peg='" + alamat_peg + '\'' +
                ", nohp_peg=" + nohp_peg +
                ", status_peg=" + status_peg +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
