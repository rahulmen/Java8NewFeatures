package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        if(s.length()==0 && t.length()==0){
            return true;
        }

        Map<Character, Integer> treeMap1 = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (treeMap1.containsKey(c)) {
                treeMap1.put(c, treeMap1.get(c) + 1);
            } else {
                treeMap1.put(c, 1);
            }
        }

        for(Character c:t.toCharArray()){
            if(treeMap1.containsKey(c)){
                treeMap1.put(c,treeMap1.get(c)-1);
            }else{
                return false;
            }
        }

       Long value = treeMap1.entrySet().stream().filter(e->e.getValue()>0).count();

        if(value==0){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(new ValidAnagram().isAnagram("rat","car"));
    }

}
