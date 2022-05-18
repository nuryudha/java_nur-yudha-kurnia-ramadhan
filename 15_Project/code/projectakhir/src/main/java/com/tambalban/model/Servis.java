package com.tambalban.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servis")
public class Servis {
    @Id
    private int id;
    private String jenis_servis;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJenis_servis() {
        return jenis_servis;
    }

    public void setJenis_servis(String jenis_servis) {
        this.jenis_servis = jenis_servis;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", jenis_servis='" + jenis_servis + '\'' +
                ", price=" + price +
                '}';
    }
}
