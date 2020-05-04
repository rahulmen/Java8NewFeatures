package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveConsumerExample1 {

    public static IntConsumer intConsumer = i-> System.out.println(i);
    public static DoubleConsumer doubleConsumer = i-> System.out.println(i);
    public static LongConsumer longConsumer = i-> System.out.println(i);


    public static void main(String[] args) {

        intConsumer.accept(10);
        doubleConsumer.accept(1234);
        doubleConsumer.accept(12.3);

    }

}
