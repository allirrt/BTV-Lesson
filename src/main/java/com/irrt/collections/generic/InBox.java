package com.irrt.collections.generic;

public class InBox <T>{
    private T obj;

    public InBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        InBox<String> stringInBox = new InBox<>("Goooi");
        InBox<Integer> integerInBox = new InBox<>(65);
        InBox<Integer> integerInBox1 = new InBox<>(66545);
        System.out.println(stringInBox.getObj() + ": " + integerInBox.getObj());
        int sum = integerInBox.getObj() + integerInBox1.getObj();
        System.out.println(sum);
    }
}
