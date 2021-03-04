package com.irrt.collections.list;

import com.sun.jdi.connect.spi.Connection;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A","B","C","D"));
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("Aa","Bd","Cg","Dg"));
        arrayList.ensureCapacity(100);
        arrayList.add(2,"Y");
        arrayList.set(2, "R");
        arrayList.addAll(2,arrayList1);
       Collections.sort(arrayList);
       arrayList.sort(new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o1.length() - o2.length();//сравнение по длине
           }
       });
        System.out.println(arrayList +"\n" + arrayList1);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","A","B", "C","A"));
//применение итератора для удаления всех "A"
        Iterator<String> iterator = list.iterator();
        while ( iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("A")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
