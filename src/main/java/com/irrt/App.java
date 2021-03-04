package com.irrt;


import java.util.Arrays;

public class App {

    private Object object;

    public App(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "App{" +
                "object=" + object +
                '}';
    }

    public void setObject(Object object) {
        this.object = object;
    }
public void info(){
    System.out.println(object.getClass().getSimpleName() + " " + object);
}

    public static void main(String[] args) {
     App app1 = new App(10);
     App app2 = new App(20);


     if(app1.getObject() instanceof Integer && app2.getObject() instanceof Integer) {
         int sums = (Integer) app1.getObject() + (Integer) app2.getObject();
         System.out.println(sums);
     }else System.out.println("error");

    }
}





