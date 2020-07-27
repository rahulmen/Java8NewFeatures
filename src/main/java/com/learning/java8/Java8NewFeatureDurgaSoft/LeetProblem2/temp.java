package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class temp {


    public static void main(String[] args) {

      Map<Integer,Integer> map = new HashMap<>();

      map.put(1,2);
        map.put(2,2);
        map.put(3,2);
        map.put(4,2);
        map.put(5,2);
        map.put(6,2);

        System.out.println(map.getOrDefault(7,1));




    }
}
