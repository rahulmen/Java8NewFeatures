package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        Map<Character,Integer> map = new HashMap<>();
        int count=0;
        for(Character c:S.toCharArray()){
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for(int i=0;i<J.length();i++){
          if(map.containsKey(J.charAt(i))){
              count+=map.get(J.charAt(i));
          }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new JewelsAndStones().numJewelsInStones("z","ZZ"));

    }
}
