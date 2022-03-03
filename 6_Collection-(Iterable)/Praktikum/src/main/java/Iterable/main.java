package Iterable;
import java.util.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int jumlah,i;
        String nama;
        SortedSet<String> kata = new TreeSet<String>();

        Scanner masukan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("input baris: ");
        jumlah = masukan.nextInt();

        for( i=1; i<=jumlah; i++) {
            System.out.print("Input =  ");
            nama = input.next();
            kata.add(nama);
        }



        Iterator <String> iterator = kata.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+ "");
        }


    }


}
