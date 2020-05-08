package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamExample10 {

    private static Integer[] toArray = {432,24,654,235,76543,245676,5432};

    public static void main(String[] args) {

        System.out.println(Stream.of(toArray).filter(i->i%2==0).collect(Collectors.toList()));

    }
}
