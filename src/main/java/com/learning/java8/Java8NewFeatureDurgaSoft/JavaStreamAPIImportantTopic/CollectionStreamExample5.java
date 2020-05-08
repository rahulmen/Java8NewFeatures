package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

/*
* Program to find Even Number using Java STream API
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamExample5 {

    private static List<Integer> integerArrayList = new ArrayList<>(Arrays.asList(3,4,2,3,44,4,2,3,4,6,6,5,3,2432,45,3));

    public static void main(String[] args) {

        List<Boolean> integers = integerArrayList.stream().map(i->i>100).collect(Collectors.toList());
        System.out.println(integers);
    }
}
