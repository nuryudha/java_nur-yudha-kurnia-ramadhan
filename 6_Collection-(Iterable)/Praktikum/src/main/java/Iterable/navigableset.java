package Iterable;

import java.util.NavigableSet;
import java.util.TreeSet;

public class navigableset {
    public static void main(String[] args) {
        NavigableSet<Integer>umur = new TreeSet<>();
        NavigableSet<Integer>umurDesc = umur.descendingSet();
        umur.add(3);
        umur.add(3);
        umur.add(4);
        umur.add(2);
        System.out.println(umurDesc);
    }
}
