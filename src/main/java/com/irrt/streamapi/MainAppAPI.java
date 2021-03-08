package com.irrt.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainAppAPI {
    public static void main(String[] args) {
new Thread(() -> {
    System.out.println("Thread");
}).start();

        String[] strings = new String[]{"FFF", "FFF", "FFF", "KKK", "LLL", "DDD", "EEE", "EEE"};
        List<String> listString = Arrays.asList(strings);
        listString.stream().filter(i -> Collections.frequency(listString, i) >2).collect(Collectors.toSet()).forEach(System.out::println);


     /*

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 7, 8, 9, 5, 7));
        List<Integer> out =  list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(Collectors.toList());//все данные после фильтра собкрутся в лист
        System.out.println(out);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 7, 8, 9, 5, 7));
        List<Integer> out1 =  list1.stream().filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(out1);

        list.stream().filter(n -> n % 3 == 1).forEach(System.out::println);
reduceEx();
    }

    //метод суммы элементм листа
private static void reduceEx(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = 0;
        for (Integer i : list){
            sum += i;
        }
        //тоже самое с применением stream
    int streamSum = list.stream().reduce(0, (a, b) -> a + b);
    System.out.println(sum + " : " + streamSum );

      */
}

}
