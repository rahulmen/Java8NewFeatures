package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.*;
import java.util.stream.Stream;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String value = String.valueOf(ch);

            if(!map.containsKey(value)){
               map.put(value,new ArrayList<>());
            }
               map.get(value).add(s);
        }
        return new ArrayList<>(map.values());

    }


    public static void main(String[] args) {

        System.out.println(new GroupAnagram().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

    }



}

