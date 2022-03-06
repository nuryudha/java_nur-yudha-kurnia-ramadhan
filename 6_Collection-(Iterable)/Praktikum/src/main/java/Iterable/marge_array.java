package Iterable;

import java.util.*;
import java.util.ArrayList;

public class marge_array {
    public static void main(String[] args) {
        String[] A = {"kazuya", "jin", "lee"};
        String[] B = {"kazuya", "feng"};
        List list = new ArrayList(Arrays.asList(A));
        list.addAll(Arrays.asList(B));
        mergeNilaiyangUnik(A, B);
    }
    public static void mergeNilaiyangUnik(String[] arrA, String[] arrB) {
        Set noDuplicateSet = new HashSet();
        noDuplicateSet.addAll(Arrays.asList(arrA));
        noDuplicateSet.addAll(Arrays.asList(arrB));
        String[] noDuplicateArray = new String[noDuplicateSet.size()];
        noDuplicateSet.toArray(noDuplicateArray);
        Arrays.sort(noDuplicateArray);

        System.out.println("Output: ");
        for (String str : noDuplicateArray) {
            System.out.println(str);

        }
    }
}
