package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.Map;
import java.util.TreeMap;

public class SortString {

    public String sortString(String s) {

        Map<Character,Integer> map1 = new TreeMap<>();
        Map<Character,Integer> map2 = new TreeMap<>((i1,i2)->-i1.compareTo(i2));

        for (Character c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
            map2.put(c,map2.getOrDefault(c,0)+1);

        }

        StringBuilder sb = new StringBuilder();

        boolean increasing = true;
        boolean decreasing = false;
        int i=0;
        while(i<s.length()){
            if(increasing==true) {
                for (Map.Entry<Character, Integer> e : map1.entrySet()) {
                    if (e.getValue() > 0) {
                        sb.append(e.getKey());
                        map1.put(e.getKey(), map1.getOrDefault(e.getKey(), 0) - 1);
                        map2.put(e.getKey(), map2.getOrDefault(e.getKey(), 0) - 1);
                        i++;
                    }
                }
                increasing = false;
                decreasing = true;
            }
            if (decreasing==true){
                for(Map.Entry<Character,Integer> e:map2.entrySet()){
                    if(e.getValue()>0){
                        sb.append(e.getKey());
                        map1.put(e.getKey(),map1.getOrDefault(e.getKey(),0)-1);
                        map2.put(e.getKey(),map2.getOrDefault(e.getKey(),0)-1);
                        i++;
                    }
                }
            }
            increasing=true;
            decreasing =false;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SortString().sortString("aaaabbbbcccc"));
    }
}
