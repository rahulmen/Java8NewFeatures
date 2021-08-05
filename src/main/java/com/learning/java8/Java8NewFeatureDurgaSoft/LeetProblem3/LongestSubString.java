package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        int length = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){

            if(set.isEmpty() || !set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                length++;
            }else{
                if(length>maxLength){
                    maxLength=length;
                }
                i=i-length;
                length=0;
                set.removeAll(set);

            }
        }

        if(length>maxLength){
            maxLength=length;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubString().lengthOfLongestSubstring("pwwk wf"));
    }

}
