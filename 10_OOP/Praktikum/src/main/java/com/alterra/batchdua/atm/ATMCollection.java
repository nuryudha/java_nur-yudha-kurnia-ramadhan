package com.alterra.batchdua.atm;

import java.text.DecimalFormat;
import java.util.*;

public class ATMCollection extends ATMUtama implements ATMInterface {

    private double saldo = 200000;
    private int batasPin = 0;
    private List<Map<String, Object>> dataRekening = new ArrayList<>();
    private Map<String, Object> mapDataRekening = new HashMap<>();
    private final DecimalFormat df = new DecimalFormat("0.00");

    public void mengisiDataRekening() {
        Map<String, Object> rekeningWahyudi = new HashMap<>(Map.of("nama", "Wahyudi", "norek", "12345678", "pin", "290401", "saldo", 42000000D));
        Map<String, Object> rekeningYoseph = new HashMap<>();
        rekeningYoseph.put("nama", "Yoseph");
        rekeningYoseph.put("norek", "87654321");
        rekeningYoseph.put("pin", "123456");
        rekeningYoseph.put("saldo", 5000000D);
        Map<String, Object> rekeningYudha = new HashMap<>();
        rekeningYudha.putAll(Map.of("nama", "Yudha", "norek", "12098765", "pin", "098765", "saldo", 9000000D));
        dataRekening.add(rekeningWahyudi);
        dataRekening.add(rekeningYudha);
        dataRekening.add(rekeningYoseph);
    }


    @Override
    public void run() {
        System.out.println("INI ADALAH PROGRAM ATM COLLECTION");
        mengisiDataRekening();
        System.out.println(dataRekening);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nomer Rekening : ");
        String norek = input.nextLine();

        Map<String, Object> mapDataRekening = mencariNorek(norek);

        if (mapDataRekening == null){
            System.out.println("Rekening tidak temukan");
            run();
        }



        if (cekPin(mapDataRekening)) return;

    }

    private boolean cekPin(Map<String, Object> mapDataRekening) {

        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Pin : ");
        String pin = input.nextLine();

        if (Objects.equals( pin,mapDataRekening.get("pin").toString())) {
            this.mapDataRekening = mapDataRekening;
            memilihMenu();

        } else {
            batasPin++;
            System.out.println("Pin Salah, Silahkan input kembali!");
            if (batasPin >= 3) {
                System.out.println("ATM TERBLOKIR");
                return true;
            }
            cekPin(mapDataRekening);

        }
        return false;
    }

    private Map<String, Object> mencariNorek(String norek) {
        for (Map<String, Object> mapDataRekening : dataRekening) {
            Object findNorek = mapDataRekening.get("norek");
            if (norek.equals(findNorek.toString())){
                return mapDataRekening;
            }

        }
        return null;
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
            default:
                System.out.println("Pilihan Anda Salah. Silahkan masukkan pilihan anatara 1 sampai 5.");
        }
        memilihMenu();
    }

    private void menampilkanSaldo() {
        System.out.println("Saldo anda adalah : ");
        System.out.println("Rp" + df.format(mapDataRekening.get("saldo")));
    }

    private void transfer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan rekening tujuan :");
        String rekeningTujuan = input.nextLine();

        Map<String, Object> dataRekeningTujuan = mencariNorek(rekeningTujuan);
        if (dataRekeningTujuan == null ) {
            System.out.println("Rekening tidak temukan");
            transfer();
        }

        System.out.println("Konfirmasi Data Rekening : \n" +dataRekeningTujuan.get("nama").toString()+ " " + dataRekeningTujuan.get("norek").toString());
        System.out.println("Apakah Nomor Rekening Tujuan sudah benar? Y/N");
        String pilih = input.nextLine();
        if(pilih.equalsIgnoreCase("Y")){
            System.out.println("Masukkan nominal yang akan ditransfer :");
            double nominal = input.nextDouble();
            double saldoRekeningPengirim = Double.parseDouble(mapDataRekening.get("saldo").toString());
            double saldoRekeningTujuan = Double.parseDouble(dataRekeningTujuan.get("saldo").toString());
            if (saldoRekeningPengirim < nominal) {
                System.out.println("Saldo anda tidak mencukupi. Transaksi gagal.");
            } else {
                saldoRekeningPengirim -= nominal;
                mapDataRekening.put("saldo", saldoRekeningPengirim);
                saldoRekeningTujuan += nominal;
                dataRekeningTujuan.put("saldo", saldoRekeningTujuan);
                System.out.println("Saldo Rekening Tujuang : " +df.format(dataRekeningTujuan.get("saldo")));
            }
        }else{
            transfer();
        }

    }

    private void tarikTunai() {
        double saldo = Double.parseDouble(mapDataRekening.get("saldo").toString());
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nominal uang yang akan ditarik :");
        double jumlah = input.nextDouble();
        if (saldo < jumlah) {
            System.out.println("Saldo anda tidak mencukupi. Transaksi gagal.");
            return;
        }
        saldo -= jumlah;
//        mapDataRekening.remove("saldo");
        mapDataRekening.put("saldo", saldo);
    }

    private void setorTunai() {
        double saldo = Double.parseDouble(mapDataRekening.get("saldo").toString());
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nominal uang yang akan disetor");
        double uang = input.nextDouble();
        saldo += uang;
        mapDataRekening.put("saldo", saldo);
    }

}


