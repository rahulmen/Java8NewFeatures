package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class IntPredicateExample1 {

    public static IntPredicate intPredicate = i->i%2==0;

    public static LongPredicate longPredicate = l->l>100;

    public static DoublePredicate doublePredicate = d->d>200;

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i:arr){
            if(intPredicate.test(i)){
                System.out.println(i);
            }
        }

        System.out.println(longPredicate.test(123));

        System.out.println(doublePredicate.test(345));

    }

}
