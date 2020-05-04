package com.learning.java8.Java8NewFeatureDurgaSoft.SupplierFunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample5 {

    private static Supplier<String> stringSupplier = ()->{
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<8;i++){
            stringBuilder.append((int)(Math.random()*9));
        }
        return new String(stringBuilder);
    };

    public static void main(String[] args) {

        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());

    }
}
