import java.util.Scanner;

public class asterisk {
    public static void main(String[] args) {
        int jumlah;

        Scanner masukan = new Scanner(System.in);

        System.out.print("input: ");
        jumlah = masukan.nextInt();

        for (int i = 1; i <= jumlah; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}

