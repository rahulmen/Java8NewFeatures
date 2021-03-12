package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void m1(String s1){
        System.out.println("ebfeb");
    }


    public static void m1(Object s1){
        System.out.println("ebfeb");
    }


    public static void main(String[] args) {
       m1("ABC");
       m1(null);

       List<String> list = new ArrayList<>();

       list.add("Push");
        list.add("Push");
        list.add("Push");
        list.add("Push");

        String[] strings = list.toArray(new String[0]);

        System.out.println(Arrays.toString(strings));





    }


}
