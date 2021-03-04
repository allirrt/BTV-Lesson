package com.irrt.collections.map.dz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ManeAppDz {
    public static void main(String[] args) {
        String[] strings = {"A", "G", "H", "H", "H", "G", "J", "N", "A", "J", "U"};
        Set<String> set = new HashSet<>(Arrays.asList(strings));
        int i = 0;
        int j = 0;

        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
                       System.out.print(next + " : " );
        }
        System.out.println(set.size());
    }

}
