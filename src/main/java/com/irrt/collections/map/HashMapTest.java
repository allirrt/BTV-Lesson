package com.irrt.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"N");
        map.put(2,"A");
        map.put(3,"L");
        //перебор Map
        for (Map.Entry<Integer, String> o : map.entrySet()){
            System.out.println(o.getKey());
            System.out.println(o.getValue());
            System.out.println("--------------------");
        }


    }
}
