package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {
        boolean isIsomorphic=true;
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
           if(!map.containsKey(s.charAt(i)) && !map1.containsKey(t.charAt(i))){
               map.put(s.charAt(i),t.charAt(i));
               map1.put(t.charAt(i),s.charAt(i));
           }else if((map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=t.charAt(i)) ||
                   (map1.containsKey(t.charAt(i)) && map1.get(t.charAt(i))!=s.charAt(i))){
               return false;
           }
        }
        return isIsomorphic;
    }

    public static void main(String[] args) {
        System.out.println(new IsomorphicString().isIsomorphic("ab","aa"));
    }
}
