package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class IsStringaPlaindrome {

    /*
    Complexity O(n)
     */

    public boolean isPalindrome(String s){

        for(int i=0;i<s.length()/2;i++){
            String temp = s.charAt(i)+"";
            String temp1= s.charAt(s.length()-1-i)+"";
            if(!temp.toLowerCase().equals(temp1.toLowerCase())){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {


        System.out.println(new IsStringaPlaindrome().isPalindrome("abBA"));



    }
}
