package com.alterra.batchdua.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ATMDataAbstraction extends ATMUtama implements ATMInterface{

    private List <Rekening> semuaRekening = new ArrayList<>();
    private int batasPin = 0;
    private Rekening rekeningActive = new Rekening();

    private void mengisiDataRekening (){
        // mengisi atribut rekening dengan constructor
        Rekening yudha = new Rekening("yudha","12345","1234" , 100000);
        Rekening satya = new Rekening("satya","23456","2345" , 200000);

        // mengisi data menggunakan getter setter
        Rekening wahyudi = new Rekening();
        wahyudi.setNama("wahyudi");
        wahyudi.setNorek("34567");
        wahyudi.setPin("3456");
        wahyudi.setSaldo(300000);
        semuaRekening.add(yudha);
        semuaRekening.add(satya);
        semuaRekening.add(wahyudi);

        for (Rekening rekening : semuaRekening) {
            System.out.println(rekening.toString());
//            System.out.println(rekening.getNama() + rekening.getNorek() + rekening.getPin() + rekening.getSaldo());
        }
    }

    public boolean pinBenar (Rekening rekeningCocok) {
        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan Masukkan Pin : ");
        String pinDariInputan = input.nextLine();

        if(pinDariInputan.equals(rekeningCocok.getPin())){
            return true;
        } else {
            batasPin++;
            System.out.println("Pin Salah, Silahkan Masukkan Pin : ");
            if(batasPin >= 3){
                System.out.println("ATM TERBLOKIR");
            }
        } return false;
    }

    private Rekening mencariRekeningByNorek(String norek) {
        for (Rekening rekening : semuaRekening) { // Melooping atau mengeluarkan semua rekening ke rekening.
            String findNorek = rekening.getNorek(); // Mengambil variabel norek dari rekening
            if(norek.equals(findNorek)){ // Membandingkan variabel norek dari parameter dengan norek dari rekening
                return rekening; // Jika sama / benar maka kita akan kembalikan rekening yang ketemu
            }
        } return null; // Jika tidak ada maka kita return null
    }

    public void memilihMenu () {
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
            default:
                System.out.println("Pilihan Anda Salah. Silahkan masukkan pilihan anatara 1 sampai 5.");
        }
        memilihMenu();

    }

    private void menampilkanSaldo() {
        System.out.println("Saldo Anda Adalah : ");
        System.out.println ("Rp" +this.rekeningActive.getSaldo());
    }

    private void transfer() {

    }

    private void tarikTunai() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Tarik Tunai : ");
        double nominalPenarikan = input.nextDouble();
        if(rekeningActive.getSaldo() < nominalPenarikan){
            System.out.println("Tarik Tunai Gagal, Saldo Tidak Mencukupi");
        } else {
           double saldoAkhir = rekeningActive.getSaldo() - nominalPenarikan;
           rekeningActive.setSaldo(saldoAkhir);
        }
    }

    private void setorTunai() {

    }

    @Override
    public void run() {
        System.out.println("INI ADALAH PROGRAM ATM DATA ABSTRACTION");
        mengisiDataRekening();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nomer Rekening : ");
        String norek = input.nextLine();

        Rekening rekeningCocok = mencariRekeningByNorek(norek);
        if(rekeningCocok == null) {
            System.out.println("REKENING TIDAK DITEMUKAN");
            run();
        }
        Boolean pinBenar = pinBenar(rekeningCocok);
        if (pinBenar) {
            this.rekeningActive = rekeningCocok;
            memilihMenu();
        } else {

        }
    }

}
