package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;

public class IntPredicate2021 {

    private static IntPredicate intPredicate = i->i%2==0;
    private static IntFunction<Integer> integerIntFunction = i->i%2;


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i:arr){
            System.out.println(intPredicate.test(i)+""+integerIntFunction.apply(i));
        }

    }
}
