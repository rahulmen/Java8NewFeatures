package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionaExample32021 {

    static Function<String,String> removeSpaces = s1->{
        return s1.replaceAll(" ","");
    };

    static BiFunction<String,String,String> stringMerge = (s1,s2)->{
        s1.replaceAll(" ","");
        s2.replaceAll(" ","");
        StringBuilder stringBuilder=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s1.length() || j<s2.length()){
            if(i==s1.length()){
                stringBuilder.append(s2.substring(j));
                return stringBuilder.toString();
            }
            if(j==s2.length()){
                stringBuilder.append(s1.substring(i));
                return stringBuilder.toString();
            }
            stringBuilder.append(s1.charAt(i));
            stringBuilder.append(s2.charAt(j));
            i++;j++;
        }
        return stringBuilder.toString();
    };

    static Function<String,String> stringStringFunction = Function.identity();

    public static void main(String[] args) {

        String s1 = "MyNa me";
        String s2 = "is Rahul";

        System.out.println(stringStringFunction.apply(stringMerge.andThen(removeSpaces).apply(s1,s2)));

    }

}
