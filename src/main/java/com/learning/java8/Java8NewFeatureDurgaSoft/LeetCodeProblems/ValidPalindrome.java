package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        if(s.length()<=1 && s.split(" ").length!=0){
            return true;
        }

        if(s.split(" ").length==0){
            return true;
        }
        boolean isPalinDrome=false;
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(s);
        for(int i=0;i<s.length();i++){
            if(matcher.region(i,i+1).find()){
                stringBuilder.append(s.charAt(i));
            }
        }
        if(stringBuilder.length()==0){
            return true;
        }else {
            int mid = stringBuilder.length() / 2;
            int i = 0;
            int j = stringBuilder.length() - 1;
            while (i <= mid && j >= mid) {
                if (stringBuilder.substring(i, i + 1).equalsIgnoreCase(stringBuilder.substring(j, j + 1))) {
                    isPalinDrome = true;
                } else {
                    isPalinDrome = false;
                    break;
                }
                i++;
                j--;
            }
        }
        return isPalinDrome;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
