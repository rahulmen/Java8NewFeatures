package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample12021 {

    static Function<Integer,Integer> function1 = i1->i1+100;
    static BiFunction<Integer,String,String> function2 = (i,s)->i+s;

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(function1.apply(100));
        list.add(function2.apply(10,"Rahul"));

        System.out.println(list);


    }
}
