package com.alterra.batchdua.atm;

import java.util.Objects;
import java.util.Scanner;

public class ATM extends ATMUtama implements ATMInterface  { // kalo mau extend , extedn terlebih dahulu . kalo interface tinggal dikoma untuk banyak interface

    // Method
    // Transfer => Mengurangi Saldo
    // Tarik Tunai => Mengurangi Saldo
    // Info saldo => Menampilkan saldo
    // Setor Tunai => Menambah saldo
    // Menu
    // Keluar

    // Atribut yang digunakan
    // 1. Punya saldo => dikurangi atau ditambahi
    // 2. Pin => Harus masukkan pin terlebih dahulu

    // Step-step
    // 1. Cek pin terlebih dahulu = dengan pin yang di setup => Buat variabel
    // 2. Saldo => Buat variabel saldo

    // Implementasian
    // 1. Buat scanner
    // 2. Input pin, jika pin sudah benar maka akan muncul menu
    // 3. Tampilkan menu

    private String pin = "291200";
    private double saldo = 200000;
    private int batasPin = 0;

    @Override
    public void run() {
        System.out.println("INI ADALAH PROGRAM ATM");
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Pin : ");
        String data = input.nextLine();
        if (Objects.equals(data, pin)) {
            memilihMenu();
        }
        else
        {
            batasPin++;
            System.out.println("Pin Salah, Silahkan input kembali!");
            if (batasPin >= 3) {
                System.out.println("ATM TERBLOKIR");
                return;
            }
            run();

        };
    }

    private void memilihMenu() {
        menampilkanMenuUtama();
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Pilih Menu");
        String pilihMenu = input.nextLine();
        switch (pilihMenu) {
            case "1":
                menampilkanSaldo();
                break;
            case "2":
                transfer();
                menampilkanSaldo();
                break;
            case "3":
                tarikTunai();
                menampilkanSaldo();
                break;
            case "4":
                setorTunai();
                menampilkanSaldo();
                break;
            case "5":
                return;
            default :
                System.out.println("Pilihan Anda Salah. Silahkan masukkan pilihan anatara 1 sampai 5.");
        }
        memilihMenu();
    }

    public void menampilkanSaldo(){
        System.out.println("Saldo anda adalah : ");
        System.out.println("Rp" + saldo);
    }
    public void transfer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan rekening tujuan :");
        String rekeningTujuan = input.nextLine();
        System.out.println("Masukkan nominal yang akan ditransfer :");
        double nominal = input.nextDouble();
        if (saldo < nominal) {
            System.out.println("Saldo anda tidak mencukupi. Transaksi gagal.");
        }else {
            saldo -= nominal;
        }
    }
    public void tarikTunai(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nominal uang yang akan ditarik :");
        double jumlah = input.nextDouble();
        if (saldo < jumlah) {
            System.out.println("Saldo anda tidak mencukupi. Transaksi gagal.");
            return;
        }
        saldo -= jumlah;
    }
    public void setorTunai(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nominal uang yang akan disetor");
        double uang = input.nextDouble();
        saldo += uang;
    }
    // Collection List of Map

}
