package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDiff {

    public char findTheDifference(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();

        for(char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);


        for(char ch:t.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)-1);

        Map<Character,Integer> m = map.entrySet().stream().
                filter(e->e.getValue()==-1).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));

        return m.keySet().stream().iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(new FindDiff().findTheDifference("dfefe","dkeffe"));
    }

}
