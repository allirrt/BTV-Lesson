package com.irrt.collections.list.dz;




public class MainAppDz {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new Apple());
        Box<Apple> anotherAppleBox = new Box<>(new Apple());

        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Fruit> fruitBox = new Box<>();

        appleBox.transfer(fruitBox);
        appleBox.transfer(anotherAppleBox);


    }


}