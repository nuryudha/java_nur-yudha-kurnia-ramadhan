import java.util.Scanner;
public class primeNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int prime, x=0;

            System.out.print("Masukan Angka : ");
            prime = input.nextInt();

            for (int i=2; i <= prime; i++){
                if (prime%i == 0){
                    x++;
                }
            }

            if (x==1){
                System.out.println(" bilangan prima");
            }else {
                System.out.println(" bukan bilangan prima");
            }
        }
    }
