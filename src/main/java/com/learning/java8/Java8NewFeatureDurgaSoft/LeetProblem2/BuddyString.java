package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import com.fasterxml.jackson.databind.util.ISO8601Utils;

import java.util.HashSet;
import java.util.Set;

public class BuddyString {

    public boolean buddyStrings(String A, String B) {
        int count =0;
        if(A.length()!=B.length() || A.length()<2 || B.length()<2) return false;
        Set<Character> set = new HashSet<>();
        for(char ch :B.toCharArray()){
            if(set.contains(ch)){
                count++;
            }else{
                set.add(ch);
            }
        }
        char ch1='\u0000';
        char ch2= '\u0000';
        int index1=Integer.MIN_VALUE;
        int index2=Integer.MIN_VALUE;
        boolean b = true;

        for (int i=0;i<B.length();i++){
            if(i<B.length()-1 && B.charAt(i)!=B.charAt(i+1)){
                b=false;
            }
            if(A.charAt(i)!=B.charAt(i) && ch1=='\u0000' && index1==Integer.MIN_VALUE){
                ch1=B.charAt(i);
                index1=i;
                continue;
            }else if (A.charAt(i)!=B.charAt(i) && ch2=='\u0000' && index2==Integer.MIN_VALUE){
                ch2=B.charAt(i);
                index2=i;
                break;
            }
        }

        if(b==true){
            return true;
        }else if(index1==Integer.MIN_VALUE  && count>0){
            return true;
        }else if(index1 != Integer.MIN_VALUE && index2 == Integer.MIN_VALUE && count>0){
            return false;
        }else if(index1 == Integer.MIN_VALUE && count==0){
            return true;
        }else if(index1 != Integer.MIN_VALUE && index2 == Integer.MIN_VALUE && count==0){
            return false;
        }

        StringBuilder sb = new StringBuilder(B);
        sb.setCharAt(index1,ch2);
        sb.setCharAt(index2,ch1);
        if(A.equals(sb.toString())){
            return true;
        } else{
            return false;
        }

    }


    public static void main(String[] args) {


        System.out.println(new BuddyString().buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }
}
