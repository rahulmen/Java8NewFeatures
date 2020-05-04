package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

/*
It is a child interface of Function<T,R>
User should go from UnaryOperator Function if both input and return type is same.
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample1 {

    private static UnaryOperator<Integer> unaryOperator = i->i*1;
    private static IntUnaryOperator intUnaryOperator = i->i*i;
    private static LongUnaryOperator longUnaryOperator = l->l*l;
    private static DoubleUnaryOperator doubleUnaryOperator = d->d*d;

    public static void main(String[] args) {

        System.out.println(unaryOperator.apply(10));
        System.out.println(intUnaryOperator.applyAsInt(20));
        System.out.println(longUnaryOperator.applyAsLong(1234867678));
        System.out.println(doubleUnaryOperator.applyAsDouble(20.0));


    }



}
