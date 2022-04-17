package com.alterra.batchdua.atm;

import java.util.Scanner;

public abstract class ATMUtama {
    // baiknya pake potected karena dia bisa diakses di kelas turunannya, public bisa tapi terlalu terbuka
    protected void menampilkanMenuUtama() {
        System.out.println("Menu ATM");
        System.out.println("1.\tInfo Saldo");
        System.out.println("2.\tTransfer");
        System.out.println("3.\tTarik Tunai");
        System.out.println("4.\tSetor Tunai");
        System.out.println("5.\tKeluar");
    }


}
