package com.learning.java8.Java8NewFeatureDurgaSoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionComparatorListExample2 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("My","name","is","Rahul","Mendiratta"));
    Collections.sort(list,(obj1,obj2)-> obj1.length()>obj2.length()?+1:obj1.length()<obj2.length()?-1:0);
    System.out.println(list);
  }
}
