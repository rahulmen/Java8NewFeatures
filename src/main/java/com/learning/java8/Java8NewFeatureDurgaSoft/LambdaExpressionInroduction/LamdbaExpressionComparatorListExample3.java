package com.learning.java8.Java8NewFeatureDurgaSoft.LambdaExpressionInroduction;

import java.util.TreeSet;

public class LamdbaExpressionComparatorListExample3 {

  public static void main(String[] args) {

    TreeSet<Integer> treeSet = new TreeSet<Integer>((int1,int2)->int1>int2?+1:int1<int2?-1:0);
    treeSet.add(1);
    treeSet.add(6789);
    treeSet.add(987);

    System.out.println(treeSet);

  }

}
