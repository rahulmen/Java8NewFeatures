package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionStreamExample7 {

    private static List<Integer> list = new ArrayList<>(Arrays.asList(43,23,654,13,8765,2465,5432,765));

    public static void main(String[] args) {
        //Min Value from the Collection
        Integer min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);
        //Max Value from the Collection
        Integer max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);

        //Filter the even number and find min value
        Integer minEven = list.stream().filter(i->i%2==0).min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(minEven);
        //Filter the even number and find max value
        Integer maxEven = list.stream().filter(i->i%2==0).max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(maxEven);

    }
}
