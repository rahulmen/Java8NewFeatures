package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class ReverseString {

    public String reverseString(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for(String s1:s.split(" ")){
            String temnp="";
            char[] charArray = s1.toCharArray();
            for(int i=charArray.length-1; i >= 0; i--){
                temnp=temnp+charArray[i];
            }
            stringBuilder.append(temnp+" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        String s = "this is javatpoint";
        System.out.println(new ReverseString().reverseString(s));
    }

}
