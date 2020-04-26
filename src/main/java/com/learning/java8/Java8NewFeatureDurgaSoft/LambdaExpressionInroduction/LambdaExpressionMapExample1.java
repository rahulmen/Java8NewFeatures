package com.learning.java8.Java8NewFeatureDurgaSoft.LambdaExpressionInroduction;

import java.util.TreeMap;

public class LambdaExpressionMapExample1 {


  public static void main(String[] args) {

    TreeMap<Integer,String> map = new TreeMap<Integer,String>((obj1,obj2)->obj1>obj2?-1:obj1<obj2?1:0);
    map.put(5,"Name");
    map.put(2,"Mendiratta");
    map.put(3,"Is");
    map.put(1,"Rahul");
    map.put(4,"My");

    System.out.println(map);

  }

}
