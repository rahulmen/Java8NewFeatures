package com.learning.java8.Java8NewFeatureDurgaSoft;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class LambdaExpressionComparatorExample1 {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>((o1,o2) -> {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0;
        });
        treeSet.add(45);
        treeSet.add(12);
        treeSet.add(65);
        System.out.println(treeSet);

    }

}
