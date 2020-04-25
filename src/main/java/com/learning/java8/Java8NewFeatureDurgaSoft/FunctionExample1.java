package com.learning.java8.Java8NewFeatureDurgaSoft;

import java.util.function.Function;

public class FunctionExample1 {


    public static void main(String[] args) {

        String[] array = {"Rahul","Gagan","Prashant","kajal","kaveeta"};

        Function<String,Integer> function = s->s.length();

        for(String s:array){
            System.out.println(function.apply(s));
        }


    }

}
