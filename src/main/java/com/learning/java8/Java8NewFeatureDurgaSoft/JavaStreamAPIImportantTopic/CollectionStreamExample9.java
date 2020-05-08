package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionStreamExample9 {

    private static List<Integer> list = new ArrayList<>(Arrays.asList(43,23,654,13,8765,2465,5432,765));

    public static void main(String[] args) {

        Integer[] integers = list.stream().toArray(Integer[]::new);

        for(Integer i:integers){
            System.out.println(i);
        }

    }
}
