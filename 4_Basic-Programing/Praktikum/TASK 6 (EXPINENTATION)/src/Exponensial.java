import java.util.Scanner;

public class Exponensial {
    public static void main(String[] args) {
        int a,b,hasil;
        Scanner input=new Scanner(System.in);

        System.out.print("Bilangan:");
         a=input.nextInt();

        System.out.print("Pangkat:");
         b=input.nextInt();

         hasil=(int) Math.pow(a, b);

        System.out.println("Hasil :"+hasil);
    }
}
