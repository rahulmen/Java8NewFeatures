package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveSupplierExample1 {

    private static DoubleSupplier doubleSupplier = ()->300000.0;
    private static LongSupplier longSupplier = ()->3000;
    private static IntSupplier intSupplier = ()->(int)(Math.random()*10);


    public static void main(String[] args) {
        System.out.println(doubleSupplier.getAsDouble());
        System.out.println(longSupplier.getAsLong());
        System.out.println(intSupplier.getAsInt());
    }


}
