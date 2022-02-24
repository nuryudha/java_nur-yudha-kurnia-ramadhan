package com.tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {Scanner userInput = new Scanner(System.in);

        System.out.println("Masukan kata:");
        String a = userInput.nextLine();
        int panjangKata = a.length();
        int jumlahKarakter = 0;
        int jumlahKata = 1;
        Map jumlahVokal = new HashMap<>();
        Map jumlahKonsonan = new HashMap<>();

        char[] vokal = {'a', 'i', 'u', 'e', 'o'};
        char[] konsonan = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        a = a.toLowerCase();
        for (int i = 0; i < panjangKata; i++) {
            char k = a.charAt(i);

            for (int j = 0; j < vokal.length; j++) {
                if (k == vokal[j]) {
                    if (jumlahVokal.containsKey(k)) {
                        int jumV = (int) jumlahVokal.get(k);
                        jumV++;
                        jumlahVokal.put(k, jumV);
                    } else {
                        jumlahVokal.put(k, 1);
                    }
                }
            }

            for (int l = 0; l < konsonan.length; l++) {
                if (k == konsonan[l]) {
                    if (jumlahKonsonan.containsKey(k)) {
                        int jumK = (int) jumlahKonsonan.get(k);
                        jumK++;
                        jumlahKonsonan.put(k, jumK);
                    } else {
                        jumlahKonsonan.put(k, 1);
                    }
                }
            }

            if (k == ' ' || k == '.' || k == '?' || k == '!') {
                jumlahKata++;
            } else {
                jumlahKarakter++;
            }
        }

        System.out.println("Jumlah huruf : " + jumlahKarakter);
        int totV = 0;
        for (int j = 0; j < vokal.length; j++) {
            int jumV = 0;
            if (jumlahVokal.get(vokal[j]) != null) {
                jumV = (int) jumlahVokal.get(vokal[j]);
            }
            totV += jumV;
        }
        System.out.println();
        System.out.println("Jumlah Vokal: " + totV + " Huruf");

        int totK = 0;
        for (int j = 0; j < konsonan.length; j++) {
            int jumK = 0;
            if (jumlahKonsonan.get(konsonan[j]) != null) {
                jumK = (int) jumlahKonsonan.get(konsonan[j]);
            }
            totK += jumK;
        }
        System.out.println();
        System.out.println("Jumlah Konsonan: " + totK + " Huruf");
    }
}
