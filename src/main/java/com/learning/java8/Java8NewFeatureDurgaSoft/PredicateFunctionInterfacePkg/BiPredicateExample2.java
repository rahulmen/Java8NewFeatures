package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample2 {

    private static BiPredicate<String,String> predicate = (s1,s2) ->s1.length()>s2.length();

    public static void main(String[] args) {

        System.out.println(predicate.test("Rahul","Mendiratta"));

    }

}
