package com.learning.java8.Java8NewFeatureDurgaSoft.ConsumerFuctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample3 {

    private static BiConsumer<String,String> biConsumer = (c1,c2)->{
        System.out.println(c1);
        System.out.println(c2);
    };

    public static void main(String[] args) {

      biConsumer.accept("Rahul","Mendiratta");

    }
}
