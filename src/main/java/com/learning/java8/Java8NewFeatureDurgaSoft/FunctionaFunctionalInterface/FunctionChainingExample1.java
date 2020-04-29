package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

import java.util.function.Function;

public class FunctionChainingExample1 {

    public static void main(String[] args) {


        Function<String,String> stringStringFunction = s->s.replaceAll(" ","");
        Function<String,String> stringIntegerFunction = s  -> s.toUpperCase().substring(8,13);

        System.out.println(stringStringFunction.andThen(stringIntegerFunction).apply("My Name is Rahul Mendiratta"));
        System.out.println(stringIntegerFunction.compose(stringStringFunction).apply("My name is Rahul Mendiratta"));
    }

}
