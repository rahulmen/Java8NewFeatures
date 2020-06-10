package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;


public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int longest = 0;
        String temp = "";
        char c = '\u0000';

        if(strs.length<=1){
            return "";
        }

        int minLenght=Integer.MAX_VALUE;
        for(String s:strs){
            if(s.length()<minLenght){
                minLenght=s.length();
            }
        }

        l1:
        for (int j = 0; j < minLenght; j++) {
            l2:
            for (int i = 0; i < strs.length; i++) {
                if (i == 0) {
                    c = strs[i].charAt(j);
                    continue l2;
                } else if (i == strs.length-1) {
                    if (strs[i].charAt(j) == c) {
                        stringBuilder.append(strs[i].charAt(j));
                    }else{
                        break l1;
                    }
                } else {
                    if (strs[i].charAt(j) == c) {
                        c = strs[i].charAt(j);
                    } else {
                        continue l1;
                    }
                }
            }
        }
        return new String(stringBuilder);
    }

    public static void main(String[] args) {

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{}));


    }


}
