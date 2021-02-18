package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfUniqueElement {

    public int sumOfUnique(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Integer i = map.entrySet().stream().filter(e->e.getValue()==1).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()))
                .keySet().stream().mapToInt(Integer::valueOf).sum();

        return i;

    }

    public static void main(String[] args) {
        System.out.println(new SumOfUniqueElement().sumOfUnique(new int[]{1,2,3,2,2}));
    }
}
