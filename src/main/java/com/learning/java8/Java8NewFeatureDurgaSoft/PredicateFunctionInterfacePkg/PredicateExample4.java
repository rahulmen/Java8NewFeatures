package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

import java.util.function.Predicate;

public class PredicateExample4 {

    public static void m1(Predicate<Integer> predicate, int[] arr) {
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] array = {5, 8, 2, 5, 9, 10, 34, 76, 31, 89, 56};
        Predicate<Integer> predicate = i -> i > 10;
        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        //Will Print number which are greater than 10
        m1(predicate, array);
        //Will print the even numbers
        m1(predicate1, array);
        //Will Print number which are less than 10
        m1(predicate.negate(), array);
        //Will print the odd numbers
        m1(predicate1.negate(), array);
        //Will print number greater than 10 and also even
        m1(predicate.and(predicate1), array);
        //Will print number greater than 10 but are not even
        m1(predicate.and(predicate1.negate()), array);
        //Will print number greater than 10 or also even
        m1(predicate.or(predicate1), array);

    }


}
