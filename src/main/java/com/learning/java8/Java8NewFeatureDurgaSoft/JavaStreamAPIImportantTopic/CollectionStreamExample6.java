package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamExample6 {

    private static List<Integer> list = new ArrayList<>(Arrays.asList(43,23,654,13,8765,2465,5432,765));

    public static void main(String[] args) {

        /*Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,(i1,i2)->-i1.compareTo(i2));
        System.out.println(list);*/
        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
        list = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(list);


    }
}
