package com.irrt.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
//-------------------------------------------------------------------------------------------
        firstEx();
        reduceEx();
//--------------------------------------------------------------------------------------------
        Stream.of("AA", "BBB", "J", "uuuuuuuuuuuuuuu").map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        }).forEach(System.out::println);
        // тоже самое, что и выше
        Stream.of("AA", "BBB", "J", "uuuuuuuuuuuuuuu").map(String::length).forEach(System.out::println);
        Stream.of("AA", "BBB", "J", "uuuuuuuuuuuuuuu").map(String::length).forEach(System.out::println);
//--------------------------------------------------------------------------------------------------------
        //преоб
        Stream.of(2, 5, 7, 8, 3, 6, 2).map(integer -> integer * 10).forEach(System.out::println);


//-----------------------------------------------------------------------------------------------------
        List<Integer> integ = new ArrayList<>(Arrays.asList(4, 6, 8, 9, 0, 4, 7, 5, 5));
        List<Integer> put1 = integ.stream().filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        integ.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
        integ.stream().distinct().forEach(System.out::println);// получаем уникальные значения

//----------------------------------------------------------------------------------------------------------
        String[] strings = new String[]{"FFF", "FFF", "FFF", "KKK", "LLL", "DDD", "EEE", "EEE"};
        List<String> listString = Arrays.asList(strings);
        listString.stream().filter(i -> Collections.frequency(listString, i) > 2)
                .collect(Collectors.toSet()).forEach(System.out::println);
//------------------------------------------------------------------------------------------------------
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 7, 8, 9, 5, 7));
        list.stream().filter(integer -> integer > 7).forEach(System.out::println);
        List<Integer> out = list.stream().filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());//все данные после фильтра соберутся в лист
        System.out.println(out);
        list.stream().filter(n -> n % 3 == 1).forEach(System.out::println);
    }

    //------------------------------------------------------------------------------------------------------
    //метод суммы элементa листа
    private static void reduceEx() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        //тоже самое с применением stream
        int streamSum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum + " : " + streamSum);
    }

    //------------------------------------------------------------------
    //Создаем класс и метод, который имеет дре реализации в т.ч Stream Api
//------------------------------------------------------------------
    static class Person {
        enum Position {
            ENGINEER, DIRECTOR, MANAGER;
        }

        private String name;
        private int age;
        private Position position;

        public Person(String name, int age, Position position) {
            this.name = name;
            this.age = age;
            this.position = position;
        }
    }

    private static void firstEx() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Mike", 44, Person.Position.MANAGER),
                new Person("Bob", 67, Person.Position.DIRECTOR),
                new Person("Stev", 33, Person.Position.ENGINEER),
                new Person("Vika", 34, Person.Position.MANAGER),
                new Person("Evg", 24, Person.Position.ENGINEER),
                new Person("Stev", 33, Person.Position.ENGINEER),
                new Person("Styt", 53, Person.Position.ENGINEER)
        ));
        List<Person> engineers = new ArrayList<>();
        for (Person o : persons) {
            if (o.position == Person.Position.ENGINEER) {
                engineers.add(o);
            }
        }
        engineers.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        List<String> engineersNames = new ArrayList<>();
        for (Person o : engineers) {
            engineersNames.add(o.name);
        }
        System.out.println(engineersNames);
        List<String> streamEngineersNamesSort = persons.stream()
                .filter(person -> person.position == Person.Position.ENGINEER)
                .sorted((o1, o2) -> o1.age - o2.age)
                .map(person -> person.name)
                .collect(Collectors.toList());
        System.out.println(streamEngineersNamesSort);
    }
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
}
