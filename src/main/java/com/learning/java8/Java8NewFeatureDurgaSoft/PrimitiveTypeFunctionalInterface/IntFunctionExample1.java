package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunctionExample1 {

    public static IntFunction intFunction = i->i*i;
    public static ToIntFunction<String> toIntFunction = s->s.length();
    public static IntToDoubleFunction intToDoubleFunction = i->Math.sqrt(i);

    public static void main(String[] args) {
        System.out.println("Square of 10 :"+intFunction.apply(10));
        System.out.println("Name Length :"+toIntFunction.applyAsInt("RahulMendiratta"));
        System.out.println("Square root :"+intToDoubleFunction.applyAsDouble(3));

    }

}
