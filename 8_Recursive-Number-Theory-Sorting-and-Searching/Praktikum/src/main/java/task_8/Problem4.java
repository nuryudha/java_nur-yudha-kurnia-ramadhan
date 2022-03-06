package task_8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        int index = 0 ,jumlah = 0, uang = 50000 , uangsek = 0;
        ArrayList <Integer> list = new ArrayList<>(List.of(25000, 25000, 10000, 14000));

        Collections.sort(list);

        while(uang >= 0 && index < list.toArray().length){
            if (uangsek == 0){
                uangsek = list.get(index);
            }
            if (uangsek != list.get(index)){
                uang = uang - list.get(index);
                jumlah++;
            }
            index++;
        }
        System.out.println(jumlah);
    }
}
