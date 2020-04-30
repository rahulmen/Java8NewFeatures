package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

import java.util.function.BiPredicate;

public class BiPredicateExample1 {

    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate = (i1,i2)->i1<2&&i2>=0;

        System.out.println(biPredicate.test(3,4));
        System.out.println(biPredicate.test(1,0));

    }

}
