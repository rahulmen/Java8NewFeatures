package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfOneBits {

    public int firstUniqChar(String s) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

       char ch = '\u0000';

        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                ch = e.getKey();
                break;
            }
        }

        return s.indexOf(ch);

    }

    public static void main(String[] args) {

        System.out.println(new NoOfOneBits().firstUniqChar("loveleetcode"));
    }
}
