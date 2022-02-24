import java.util.Scanner;

public class asterisk {
    public static void main(String[] args) {
        int jumlah,i,j,k;

        Scanner masukan = new Scanner(System.in);

        System.out.print("input baris: ");
        jumlah = masukan.nextInt();

        for( i=1; i<=jumlah; i++) {
            for( j=jumlah; j>i; j--) {
                System.out.print(" ");
            }
            for( k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

