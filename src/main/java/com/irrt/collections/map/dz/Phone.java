package com.irrt.collections.map.dz;

import java.util.Arrays;
import java.util.HashMap;

public class Phone {
    private HashMap<String, int[]> phone;

    public Phone(HashMap<String, int[]> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone=" + phone +
                '}';
    }

    public HashMap<String, int[]> getPhone() {
        return phone;

    }

    public void add(String name, int number[]) {
        Phone phoneBook = new Phone(phone);
        phone.putIfAbsent(name, number);

    }

    public void getPhone(String name) {
        Phone phoneBook = new Phone(phone);

        System.out.println("Phone " + name + ": " + Arrays.toString(phone.get(name)));
    }
}
