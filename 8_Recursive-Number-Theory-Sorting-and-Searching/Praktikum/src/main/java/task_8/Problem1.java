package task_8;

import java.util.*;
import com.sun.jdi.ArrayType;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(prime(1));

    }


    public static int prime(int search){
        List<Integer> array = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        return array.get(search - 1);
//        for(int i = 0; i < array.length ; i++ ){
//            array.get(search);
//        }

    }
}
