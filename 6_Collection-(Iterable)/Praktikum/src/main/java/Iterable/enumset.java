package Iterable;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class enumset {
    enum monts {
        JANUARY, FEBRUARY, MARCH, MAY, JUNE, JULY, AGUSTUS, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER
    }

    public static void main(String[] args) {
        Set<monts> set = EnumSet.allOf(monts.class);
        Iterator<monts> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

    }
}
