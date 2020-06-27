package com.learning.java8.Java8NewFeatureDurgaSoft.ShivanshuLamdbaTeaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo1<T> {

    static List<Integer> integerList = new ArrayList<>(Arrays.asList(6,3,45,7,8,3,2,45,67,8,4,34,242,432,432,432,5432,566,32,3,542,245,3,23543,2,4,5,43,3,5,4,32,4,53,2,35,43,3,4,5,43,34,3,543,2,34,4,33,43,53,43,242,42,42,42,3432,43243,432,543,543,245,543,3454,543,45543,235454,34543,243,3453,3454,3454,34543,56543,345,42345,34543,34543,454,34564,345643,34564,45654,345643,36543,34543,34564,34564,3454,3454,3454,33454,33453,3453,3454,33454,3345,433456,5433456,5433456,433456,433456,43,543));

    static Predicate<List> predicate = integerList->integerList.size()>10;

    static Predicate<Integer> predicate1 = i->i<10;

    static Function<Integer,Integer> integerIntegerFunction = i->i+10;

   static  List<? super Object> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add(10);
        list.add("String");

        System.out.println(predicate.test(integerList));
        Long time1 = System.currentTimeMillis();

        integerList= integerList.stream().filter(predicate1).collect(Collectors.toList());

        //integerList.stream().map()



        Long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        System.out.println(integerList);



    }

}
