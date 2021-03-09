package com.irrt.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainAppCatReflection {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException {

//--------------------------------------------------------------------------------------
        Class aClass = Cat.class;
        System.out.println(aClass.getName());

        Method[] methods = aClass.getDeclaredMethods();
        for (Method o : methods) {
            System.out.println(o.getName());
        }

        Cat cat = new Cat(1, 2, 3);

        methods[0].setAccessible(true);//предоставляем доступ к приватному методу
        methods[0].invoke(cat);//вызываем приватный метод у класса Cat
        // methods[1].invoke(cat);

        Field[] fields = aClass.getDeclaredFields();//получем все поля сласса Cat
        System.out.println(Arrays.toString(fields));
        fields[1].set(cat, 20); // меняем значение переменной
        System.out.println(fields[1].get(cat));
// создаем объект класса Cat
        Cat cat1 = (Cat) aClass.getDeclaredConstructor(int.class, int.class, int.class)
                .newInstance(15, 79, 46);
        System.out.println(cat1);
//---------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------

        Human human = new Human("G", 11);
        //получаем доступ к классу, который находится в другом пакете на диске
//       ClassLoader classLoader = new URLClassLoader(new URL[] {new Field(
//               "C:/Job/Program/JAVA")
//       .toURL()});
        //создаем объект класса и вызываем у него метод greetings
//Class humanClass = classLoader.loadClass("HumanTest");
//Object humanObj = humanClass.getConstructor(String.class, int.class).newInstance("Vika", 20);
//Method greetingsMethod = humanClass.getDeclaredMethod("greetings");
//greetingsMethod.invoke(humanObj);


        Class testClass = TestClass.class; //получаем доступ к методам TestClass
        Method[] methods1 = testClass.getDeclaredMethods();
         for (Method m :methods1){
             System.out.println(m);
         }
    }

}
