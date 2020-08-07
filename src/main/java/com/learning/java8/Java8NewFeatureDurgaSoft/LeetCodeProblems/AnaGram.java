package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.lang.reflect.Array;
import java.util.*;

public class AnaGram {

    public boolean isAnaGram(String s1,String s2){

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s1.length();i++)
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);


        for(int i=0;i<s2.length();i++){
            if(map.containsKey(s2.charAt(i)))
                map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
            else
                return false;
        }
        return map.entrySet().stream().filter(e-> e.getValue()<0 || e.getValue()>0).count()==0;
    }

    public static void main(String[] args) {
        HashSet<List<Integer>> lists = new HashSet<List<Integer>>();
        lists.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        lists.add(new ArrayList<Integer>(Arrays.asList(1,2)));

        System.out.println(lists);

    }
}
