package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Demo {

    static List<String> list = new ArrayList<>(Arrays.asList("Google","Amamzon","Flipkart","Google","Google","Flipkart"));

    TreeMap<String,Integer> map = new TreeMap<>((s1,s2)->-s1.compareTo(s2));


    public static void main(String[] args) {
        for(int i=0;i<list.size();i++){
            if(i==3)
            list.remove(i);
        }

        System.out.println(list);
    }

}
