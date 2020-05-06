package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionStreamExample8 {

    private static List<Integer> list = new ArrayList<>(Arrays.asList(43,23,654,13,8765,2465,5432,765));

    public static void main(String[] args) {

        list.stream().forEach(i-> System.out.print(i+","));
        System.out.println();
        list.stream().forEach(System.out::print);

    }
}
