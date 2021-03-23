package com.learning.java8.Java8NewFeatureDurgaSoft.ShivanshuLamdbaTeaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

    public static List<Integer> list = new ArrayList<>(Arrays.asList(10,5,3,4,4,2,4));

    public static void main(String[] args) {
        System.out.println(list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList()));
    }

}
