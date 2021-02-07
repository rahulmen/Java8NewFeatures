package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.HashMap;
import java.util.Map;

public class FindWordsInString {

    public int countCharacters(String[] words, String chars) {

        int count=0;

        Map<Character,Integer> map1 = new HashMap<>();

        for(char c:chars.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for(int i=0;i<words.length;i++){

            Map<Character,Integer> map2 = new HashMap<>();

            for(char c:words[i].toCharArray()){
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
            boolean b = true;
            int counter=0;
            for(Map.Entry<Character,Integer> e:map2.entrySet()){
                if(map1.containsKey(e.getKey()) && map1.get(e.getKey())>=e.getValue()){
                    counter+=e.getValue();
                    continue;
                }else{
                    break;
                }
            }
            if(counter==words[i].length()){
                count+=counter;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        System.out.println(new FindWordsInString().countCharacters(new String[]{"hello","world","leetcode"},"welldonehoneyr"));

    }
}
