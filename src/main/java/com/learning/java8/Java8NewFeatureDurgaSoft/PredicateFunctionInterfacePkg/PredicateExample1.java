package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

import java.util.function.Predicate;

public class PredicateExample1 {

    public static void main(String[] args) {

        Predicate<String> predicate = s->s.length()>10;
        System.out.println(predicate.test("Rahul"));
        System.out.println(predicate.test("Rahul Mendiratta"));


        Predicate<String> predicate1 = Predicate.isEqual("Rahul");

        System.out.println(predicate1.test("Rahul"));

    }


}
