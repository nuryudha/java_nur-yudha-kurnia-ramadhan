package task_8;

public class Problem3 {
    public static void main(String[] args) {
        Integer[] arr={5, 7, 4, -2, -1, 8};
        MinMax(arr);
    }

    private static void MinMax(Integer[] arr) {
        int min = 0 ,max = 0,indexMin = 0,indexMax = 0;
        for (int i = 0 ; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                indexMin = i;
            }
            else {
                max= arr[i];
                indexMax = i;
            }

        }
//        System.out.println(min);
        System.out.println("Min : "+ min + " Index : " +indexMin);
//        System.out.println(max);
        System.out.println("Max : "+ max + " Index : " +indexMax);
    }
}
