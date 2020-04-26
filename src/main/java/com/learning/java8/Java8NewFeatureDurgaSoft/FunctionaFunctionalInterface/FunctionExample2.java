package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;


import java.util.function.Function;

public class FunctionExample2 {

    public static String name =
            "My name is Rahul Mendiratta";


    public static void main(String[] args) {

        /*
Program to remove spaces present in the given string using function.
 */
        Function<String, String> function = s -> s.replaceAll(" ", "");
        System.out.println(function.apply(name));

                /*
Program to find number of length in the String
 */

        Function<String, Integer> function1 = s -> s.length() - s.replaceAll(" ", "").length();
        System.out.println(function1.apply(name));

    }


}
