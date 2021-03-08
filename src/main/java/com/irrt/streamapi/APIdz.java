package com.irrt.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class APIdz {

    String name;
    int age;
    int salary;

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public APIdz(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {


        Collection<APIdz> customer = Arrays.asList(new APIdz("Bob", 34,3800), new APIdz("John", 23, 1500),
                new APIdz("Mick", 56, 5600), new APIdz("Nick", 45, 2900));


        List<Integer> collectorCollection =
                customer.stream().map(APIdz::getSalary).collect(Collectors.toList());
        System.out.println(collectorCollection);// получаем все зарплаты [3800, 1500, 5600, 2900]


        double averagePrice = customer.stream()
                .collect(Collectors.averagingInt(APIdz::getSalary));
        System.out.println(averagePrice); // получаем среднюю зарплату 3450.0

        maxAge(customer);

    }

    private static void maxAge(Collection<APIdz> customer){

        double n = customer.stream().mapToInt(APIdz::getAge).max().getAsInt();

        List<APIdz> maxAge = customer.stream().filter((p)-> p.getAge() >= n
        ).collect(Collectors.toList());

        for (APIdz apIdz : maxAge) {
            System.out.println(apIdz.name + " - " + apIdz.getAge());
        }

    }
}
