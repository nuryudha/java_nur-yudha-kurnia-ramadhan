package com.alterra.batchdua.atm;


public class Rekening {
    private String nama;
    private String norek;
    private String pin;
    private double saldo;

    // all argumen constructor

    public Rekening(String nama, String norek, String pin, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.pin = pin;
        this.saldo = saldo;
    }
    // no args constructor
    public Rekening(){

    }

    // set itu nulis
    // get itu membaca / mendapatkan
    // berfungsi untuk membatasi suatu class atau object karena fungsi private hanya bisa diakes lokal

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNorek() {
        return norek;
    }

    public void setNorek(String norek) {
        this.norek = norek;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Rekening{" +
                "nama='" + nama + '\'' +
                ", norek='" + norek + '\'' +
                ", pin='" + pin + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
