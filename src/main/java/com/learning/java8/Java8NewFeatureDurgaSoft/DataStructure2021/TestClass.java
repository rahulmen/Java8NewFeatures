package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

import java.util.*;
import java.util.stream.Collectors;

public class TestClass {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i : map.values()){
            set.add(i);
        }

        if(map.size()==set.size())
            return true;
        return false;
    }

    public static void main(String[] args) {

        //System.out.println(new TestClass().uniqueOccurrences(new int[]{1,2,2,1,1,3}));

        String s = "Rahul";
        //System.out.println(Arrays.stream(s.split("")).collect(Collectors.toList()));
        System.out.println(Arrays.asList(s.split("")));

        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('a',2);
        map.put('a',3);
        map.put('b',1);
        System.out.println(map);






    }

}
