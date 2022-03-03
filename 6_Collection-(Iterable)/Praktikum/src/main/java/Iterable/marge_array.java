package Iterable;

import java.util.*;

public class marge_array {
    public static void main (String[] args) {

        String nama1,nama2,kata;
        int jumlah1,jumlah2,i;

        Scanner masukan1 = new Scanner(System.in);
        Scanner masukan2 = new Scanner(System.in);
        Scanner banyaknya_ulangan1 = new Scanner(System.in);
        Scanner banyaknya_ulangan2 = new Scanner(System.in);

        System.out.print("Banyaknya array 1 =  ");
        jumlah1 = banyaknya_ulangan1.nextInt();

        System.out.print("Banyaknya array 2 =  ");
        jumlah2 = banyaknya_ulangan2.nextInt();


        for( i=1; i<=jumlah1; i++) {
            System.out.print("Input 1 =  ");
            nama1 = masukan1.next();
            String[] A = {nama1};
        }
        for( i=1; i<=jumlah2; i++) {
            System.out.print("Input 2 =  ");
            nama2 = masukan2.next();
            String [] B =  {nama2};
        }


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
