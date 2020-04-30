package com.learning.java8.Java8NewFeatureDurgaSoft.SupplierFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample1 {

    public static void main(String[] args) {

        Supplier<List<String>> supplier=()->new ArrayList<>(Arrays.asList("My","name","Is","Rahul","Mendiratta"));
        Consumer<String> consumer = s-> System.out.println(s);

        List<String> strings = supplier.get();
        for(String s:strings){
            consumer.accept(s);
        }


    }
}
