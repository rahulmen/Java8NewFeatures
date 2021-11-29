package com.learning.java8.Java8NewFeatureDurgaSoft.PhonePeInter;

/*
Given two input String A and B. Return True if B is a Substring of A. provided A is a circular String
Eg.1: A="qwerty" and B="erty" output = true
Eg.2: A= "qwerty" and B="rtyq" output = true
Eg.3: A= "qwerty" and B="rtyw" output = false
 */

public class Problem1 {

    public boolean isSubString(String s,String temp){
        return (s+s).contains(temp)?true:false;
    }

    public static void main(String[] args) {
        System.out.println(new Problem1().isSubString("qwerty","erty"));
        System.out.println(new Problem1().isSubString("qwerty","rtyq"));
        System.out.println(new Problem1().isSubString("qwerty","rtyw"));

    }
}
