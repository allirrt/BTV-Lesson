package com.irrt.collections.list;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> arrayList = new LinkedList<>(Arrays.asList("A","B","C","D"));


        String[] arrayList2 = {"Aa","Bd","Cg","Dg"};
        List<String> arrayList3 = convertToList(arrayList2);
        for (Iterator<String> iterator = arrayList3.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println(next);
        }


    //ДЗ №4

        int [] intArray= new int [] {2, 4, 5,8};

        int l= intArray[0];
        int r= intArray[1];
        System.out.println(Arrays.toString(intArray));
        returnReversArray(intArray);
        System.out.println(Arrays.toString(intArray));


    }

    static void returnReversArray(int[] arr){
        int temp;
        for (int i = arr.length-1, j = 0; i >=arr.length/2 ; i--,j++) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    public static List<String> arrayListString(String[] arr){
        List<String> list = Arrays.asList(arr);
        return list;
    }

public static <T> ArrayList <T> convertToList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
}

    }

