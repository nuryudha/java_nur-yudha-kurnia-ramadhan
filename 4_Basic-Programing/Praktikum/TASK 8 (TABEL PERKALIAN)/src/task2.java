import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int jumlah;
        String tabel = "";

        Scanner hitung = new Scanner(System.in);

        System.out.println("Masukan :");
        jumlah = hitung.nextInt();
        //String tabelnya ;

        //cetak tubuh tabel
        for (int i = 1; i <= jumlah; i++) {
            tabel += i + " | ";
            for (int j = 1; j <= 9; j++) {
                //menampilkan angka dan pengaturan
                if (i * j < 10) {
                    tabel += " " + i * j;
                } else {
                    tabel += " " + i * j;

                }
            }
            tabel += "\n";
        }
        //menampilkan hasilnya
        System.out.println(tabel);
    }
}
