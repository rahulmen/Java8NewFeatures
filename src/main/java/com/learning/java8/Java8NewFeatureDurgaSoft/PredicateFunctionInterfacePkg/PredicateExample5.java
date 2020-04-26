package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

/*
Predicate example to print names which starts with K
 */

import java.util.function.Predicate;

public class PredicateExample5 {


    public static void main(String[] args) {
        String[] array = {"Rahul","Gagan","Prashant","kajal","kaveeta"};
        Predicate<String> predicate = s->s.substring(0,1).equals("k");

        for(String s:array){
            if(predicate.test(s)){
                System.out.print(s+" ");
            }
        }


    }


}
