package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicatePractice2021Third {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("",null,"Rahul","mendiratta"));
        list.stream().filter(s -> s!=null && !s.isEmpty()).forEach(System.out::println);

    }
}
