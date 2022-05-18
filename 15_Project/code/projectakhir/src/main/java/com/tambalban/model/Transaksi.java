package com.tambalban.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transaksi")
public class Transaksi {
    @Id
    private int id;
    private int pegawai_id;
    private int customer_id;
    private int payment_id;
    private int status;
    private int total_service;
    private int total_qty;
    private int total_price;
    private Date created_at;
    private Date updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPegawai_id() {
        return pegawai_id;
    }

    public void setPegawai_id(int pegawai_id) {
        this.pegawai_id = pegawai_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotal_service() {
        return total_service;
    }

    public void setTotal_service(int total_service) {
        this.total_service = total_service;
    }

    public int getTotal_qty() {
        return total_qty;
    }

    public void setTotal_qty(int total_qty) {
        this.total_qty = total_qty;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
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
        return "Transaksi{" +
                "id=" + id +
                ", pegawai_id=" + pegawai_id +
                ", customer_id=" + customer_id +
                ", payment_id=" + payment_id +
                ", status=" + status +
                ", total_service=" + total_service +
                ", total_qty=" + total_qty +
                ", total_price=" + total_price +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
