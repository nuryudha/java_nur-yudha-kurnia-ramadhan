package com.alterra.batchdua.atm;

public class Main {
    public static void main(String[] args) {
//        ATMCollection output = new ATMCollection();
        // ATMDataAbstraction atm = new ATMDataAbstraction();
//        output.run();
       // atm.run();

        ATMInterface atm = new ATMDataAbstraction();
        atm.run();
    }
}
