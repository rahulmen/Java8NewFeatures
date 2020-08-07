package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class ValidPalindromeAfterSingleCharRemoval {

    public boolean isValidRange(String s,int i,int j){
        int mid = i+(j-i)/2;
        for(int k=i;k<=mid;k++){
            if(s.charAt(k)!=s.charAt(j)){
                return false;
            }
            j--;
        }
       return true;

    }

    public boolean isValid(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(i-1-i)){
                int j = s.length()-1-i;
                if(isValidRange(s,i,j-1) || isValidRange(s,i+1,j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new ValidPalindromeAfterSingleCharRemoval().isValid("abcdba"));







    }
}
