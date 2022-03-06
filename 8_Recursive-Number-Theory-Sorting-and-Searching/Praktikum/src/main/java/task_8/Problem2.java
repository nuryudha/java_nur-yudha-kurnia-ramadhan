package task_8;

public class Problem2 {
    public static void main(String[] args) {
        for (int i = 0; i<3; i++){
            int hasil = fibo(i);
            System.out.print(hasil + " ");
        }
    }
    public static Integer fibo(int input){

        if (input == 0){
            return 0;
        }
        if (input == 1){
            return 1;
        }
        return fibo(input - 1 ) + fibo(input - 2);
    }
}
