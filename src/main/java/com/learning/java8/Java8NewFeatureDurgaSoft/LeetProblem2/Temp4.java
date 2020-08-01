package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Temp4 {

    public static void main(String[] args) {

      /*  int[] i = new int[]{0,1,2,3,1,2,3};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i1:i){
            map.put(i1,map.getOrDefault(i1,0)+1);
        }*/

        Set<Integer[]> set = new HashSet<>();
        Integer[] integers = {0,0};
        set.add(integers);
        integers = new Integer[]{0,1};

        if(set.contains(integers)){
            System.out.println("Yes");
        }




    }
}
