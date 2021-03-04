package com.irrt.collections.map.dz;

import java.util.HashMap;


public class MainAppDzHashTable {
    public static void main(String[] args) {
        HashMap<String, int[]> phones = new HashMap<>();
        Phone phoneBook = new Phone(phones);


        phoneBook.add("Mary", new int[]{34567, 34567, 4567});

        phoneBook.add("Pey", new int[]{34567});


        phoneBook.add("For", new int[]{34567});

        phoneBook.add("TTTTTTTTTTT", new int[]{34567});


        phoneBook.getPhone("Mary");
    }
}
