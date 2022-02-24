import java.util.Scanner;


public class PALINDROME {
    public static void main(String[] args) {
        String kata;

        Scanner input= new Scanner(System.in);

        System.out.print("Input =  ");
        kata = input.nextLine();

        StringBuilder sb = new StringBuilder(kata);

        String revStr = sb.reverse().toString();
        System.out.println("Kata yang dibalik = " + revStr);

        if(kata.equalsIgnoreCase(revStr) == true) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Bukan Palindrome");
        }
    }

}
