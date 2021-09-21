package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddString {


    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(0,stringBuilder.length());
        System.out.println(stringBuilder.toString());
        Set<Character> set = new TreeSet<>();
        stringBuilder.delete(0,stringBuilder.length());
    }



}
