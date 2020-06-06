package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(1,4,5,6,4,3,45,6));

        for(int i=0;i<l.size();i++){
            l.remove(i);
        }

        System.out.println(l);

    }
}
