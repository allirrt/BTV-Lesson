package com.irrt.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//создаем свою анотацию
@Retention(RetentionPolicy.RUNTIME) //она видна только в процессе выполнения
@Target(ElementType.METHOD) //применяется только к методам
public @interface MyAnno {
    int priority() default 5;
}