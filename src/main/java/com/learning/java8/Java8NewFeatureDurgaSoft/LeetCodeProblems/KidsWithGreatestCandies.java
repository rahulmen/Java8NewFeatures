package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KidsWithGreatestCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> integerList = new ArrayList<>();
        Arrays.stream(candies).forEach(i->integerList.add(i));
        int max = Collections.max(integerList);
        return integerList.stream().map(i->i+extraCandies>=max).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(new KidsWithGreatestCandies().kidsWithCandies(new int[]{2,3,5,1,3},3));
    }

}
