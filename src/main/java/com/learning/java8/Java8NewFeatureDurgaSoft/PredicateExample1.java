package com.learning.java8.Java8NewFeatureDurgaSoft;

import java.util.function.Predicate;

public class PredicateExample1 {

    public static void main(String[] args) {

        Predicate<String> predicate = s->s.length()>10;
        System.out.println(predicate.test("Rahul"));
        System.out.println(predicate.test("Rahul Mendiratta"));

    }


}
