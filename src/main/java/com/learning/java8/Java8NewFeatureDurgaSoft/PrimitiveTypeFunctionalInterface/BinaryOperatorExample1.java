package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

/*
It is a child interface of BiFunction<T,T,R>
User should go from BinaryOperator Function if both inputs and return type are same.
 */

import java.util.function.*;

public class BinaryOperatorExample1 {

    private static BinaryOperator<Integer> unaryOperator = (i1,i2)->i1*i2;
    private static IntBinaryOperator intBinaryOperator = (i1,i2)->i1*i2;
    private static LongBinaryOperator longBinaryOperator = (l1,l2)->l1*l2;


    public static void main(String[] args) {

        System.out.println(unaryOperator.apply(12,34));
        System.out.println(intBinaryOperator.applyAsInt(12,34));
        System.out.println(longBinaryOperator.applyAsLong(123456,1234567897));


    }



}
