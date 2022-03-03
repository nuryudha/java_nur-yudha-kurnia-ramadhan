package Iterable;
import java.util.*;
public class coba_coba {
    public static void main(String[]args) {
        Iterable<String> names = List.of("Alterra", "Academy");
//        for (var name : names) {
//            System.out.print(name);
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String i = it.next();
            System.out.print(i);
            }
        }
    }

