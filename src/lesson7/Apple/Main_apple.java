package lesson7.Apple;

import java.lang.reflect.Field;

public class Main_apple {
    public static void main(String[] args) throws Exception {
        Apple apple = new Apple();

        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "Pink");
        System.out.println(field.get(apple));
    }
}