package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamExample5 {

    private static List<String> stringList1 = new ArrayList<>(Arrays.asList("Prashant","Sumit","Ankit","Ram","Sham"));

    public static void main(String[] args) {

        Long number = stringList1.stream().map(s->s+10).filter(s->s.length()>2).count();
        System.out.println(number);
    }
}
