package com.learning.java8.Java8NewFeatureDurgaSoft.SupplierFunctionalInterface;

import java.util.function.Supplier;

public class SupplierPractice2021 {

    private static Supplier<String> stringSupplier = ()->{
        String[] names = {"Rahul","Prashant","Neeraj","Prateek"};
        return names[(int)(Math.random()*4)];
    };

    public static void main(String[] args) {

        System.out.println(stringSupplier.get());


    }
}
