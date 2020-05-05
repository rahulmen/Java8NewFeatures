package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamExample3 {

    private static List<String> stringList1 = new ArrayList<>(Arrays.asList("Prashant","Sumit","Ankit","Ram","Sham"));

    public static void main(String[] args) {

        List<String> stringList = stringList1.stream().filter(s->s.length()>=4).collect(Collectors.toList());
        System.out.println(stringList);

    }
}
