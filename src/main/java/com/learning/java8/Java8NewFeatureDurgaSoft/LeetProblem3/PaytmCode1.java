package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.HashMap;
import java.util.Map;

public class PaytmCode1 {

    private boolean isAnagram(String s1,String s2){

        if(s1.length()!=s2.length())return false;


        Map<Character,Integer> map1 = new HashMap<>();

        for(char ch:s1.toCharArray())
            map1.put(ch,map1.getOrDefault(ch,0)+1);

        System.out.println(map1);

        for(char ch:s2.toCharArray()){
            if(map1.containsKey(ch)) {
                map1.put(ch, map1.getOrDefault(ch, 0) - 1);
            }else{
                return false;
            }
        }

        System.out.println(map1);

        long count = map1.entrySet().stream().filter(e->e.getValue()!=0).count();
        System.out.println(count);

           if(count==0)
               return true;
           else
               return false;
    }


    public static void main(String[] args) {

        System.out.println(new PaytmCode1().isAnagram("hotstar","otstarh"));

    }
}
