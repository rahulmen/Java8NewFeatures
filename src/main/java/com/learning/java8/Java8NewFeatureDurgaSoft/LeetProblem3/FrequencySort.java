package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.*;

public class FrequencySort {

    public String frequencySort(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        StringBuilder str = new StringBuilder();
        System.out.println(map);


        for(int i=0;i<map.size();i++) {
            int max =Integer.MIN_VALUE;
            Map.Entry<Character,Integer> temp = null;
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if(e.getValue()>max){
                    temp=e;
                    max = e.getValue();
                }
            }
            int loop = temp.getValue();
            while (loop > 0) {
                str.append(temp.getKey());
                loop--;
            }
            map.put(temp.getKey(),-1);
        }

        return str.toString();

    }

    public static void main(String[] args) {
        System.out.println(new FrequencySort().frequencySort("abcdaannnnn"));
    }
}
