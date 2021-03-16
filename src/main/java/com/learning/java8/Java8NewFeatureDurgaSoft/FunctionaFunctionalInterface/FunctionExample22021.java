package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class FunctionExample22021 {

    private static BiFunction<List<Integer>, List<Integer>, TreeSet<Integer>> biFunction = (l1,l2)->{
        TreeSet<Integer> set = new TreeSet<>((i1,i2)->-i1.compareTo(i2));
        set.addAll(l1);
        set.addAll(l2);
        return set;
    };

    public static Consumer<Integer> consumer = i-> System.out.println(i%2);

    public static void main(String[] args) {
        Set<Integer> set = biFunction.apply(new ArrayList<>(Arrays.asList(1,2,3,4,5)),new ArrayList<>(Arrays.asList(5,6,7,8,9)));
        set.stream().forEach(i->{
            consumer.accept(i);
        });
    }

}
