package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class RotateString {

    public boolean rotateString(String A, String B) {

        return A.length()==B.length() && (A+A).contains(B);

    }

    public static void main(String[] args) {

        System.out.println(new RotateString().rotateString("abcde","cdeab"));


    }

}
