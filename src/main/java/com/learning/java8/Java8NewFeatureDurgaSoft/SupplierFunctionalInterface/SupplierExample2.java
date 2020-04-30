package com.learning.java8.Java8NewFeatureDurgaSoft.SupplierFunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample2 {


    public static void main(String[] args) {

        Supplier<String> stringSupplier = ()->{
            String[] names = {"Hunny","Buuny","Sunny","Money","Rahul","Ravi"};
            int index = (int)(Math.random()*6);
            return names[index];
        };

        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());

    }
}
