package com.irrt.reflection;

public class TestClass {
    @MyAnno(priority = 3) //применяем созданную нами анотацию
    public static void method1() {
        System.out.println("method 1");
    }

    @MyAnno(priority = 4)
    public static void method2() {
        System.out.println("method 2");
    }

    @MyAnno(priority = 2)
    public static void method3() {
        System.out.println("method 3");
    }
}
