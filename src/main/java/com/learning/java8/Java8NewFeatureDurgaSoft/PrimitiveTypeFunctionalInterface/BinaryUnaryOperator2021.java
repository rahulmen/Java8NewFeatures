package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class BinaryUnaryOperator2021 {

    private static LongUnaryOperator longUnaryOperator = i->i+123;
    private static LongBinaryOperator longBinaryOperator = (i1,i2)->i1+i2+123;
    private static BinaryOperator<String> binaryOperator = (i1, i2)->i1+i2+123;


    public static void main(String[] args) {

        System.out.println(longUnaryOperator.applyAsLong(10));
        System.out.println(longBinaryOperator.applyAsLong(10,20));
        System.out.println(binaryOperator.apply("123","3343"));

    }

}
