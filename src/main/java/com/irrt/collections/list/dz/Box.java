package com.irrt.collections.list.dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Box<T extends Fruit> {
    private ArrayList<T> boxFruit;

    public Box() {
        this.boxFruit = new ArrayList<>();
    }
    public Box(T... fruts) {
        this.boxFruit = new ArrayList<>(Arrays.asList(fruts));
    }


    public boolean compare(Box <?> another){
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void add(T fruit){
        this.boxFruit.add(fruit);
    }

    public void add(T... fruits){
      this.boxFruit.addAll(Arrays.asList(fruits));
        }

    public float getWeight(){
        if (boxFruit.size() == 0){
            return 0.0f;
        }
        return boxFruit.size() * boxFruit.get(0).getWeight();
    }
    public void transfer(Box<? super T> another) {
        if (this == another){
            return;
        }
        another.boxFruit.addAll(this.boxFruit);
this.boxFruit.clear();
    }

}
