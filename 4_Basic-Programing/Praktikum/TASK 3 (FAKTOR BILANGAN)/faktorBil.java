import java.util.Scanner;
public class faktorBil {
    public static void main(String[] args)
        {
            int nilai;

            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan angka : ");
            nilai = input.nextInt();

            for(int i = 1;i <= nilai ; i++)
            {
                if(nilai % i == 0)
                {
                    System.out.print(i + "\n");
                }
            }
        }
    }

