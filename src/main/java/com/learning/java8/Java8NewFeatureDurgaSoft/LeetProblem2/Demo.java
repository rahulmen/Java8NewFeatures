package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Demo {

    List<String> list = new ArrayList<>(Arrays.asList("Google","Amamzon","Flipkart","Google","Google","Flipkart"));

    TreeMap<String,Integer> map = new TreeMap<>((s1,s2)->-s1.compareTo(s2));



}
