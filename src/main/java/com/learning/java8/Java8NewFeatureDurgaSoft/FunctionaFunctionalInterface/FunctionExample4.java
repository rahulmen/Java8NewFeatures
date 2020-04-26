package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

import java.util.*;
import java.util.function.Function;

/*

Program to sort as per user defined sortign order and return without duplicate

*/

public class FunctionExample4 {

    public static void main(String[] args) {

        Function<List,TreeSet> function = i->{
            Collections.sort(i);
            TreeSet<Integer> treeSet = new TreeSet<>((i1,i2)->-i1.compareTo(i2));
            treeSet.addAll(i);
            return treeSet;
        };

        System.out.println(function.apply(new ArrayList(Arrays.asList(1,42,1,2,5432,5432,1,245,654))));

    }

}
