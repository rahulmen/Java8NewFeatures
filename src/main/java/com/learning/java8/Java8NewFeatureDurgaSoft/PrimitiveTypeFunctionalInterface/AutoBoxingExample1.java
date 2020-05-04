package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

public class AutoBoxingExample1 {

    public static void main(String[] args) {

        int i=10;
        Integer i1 = i;   // Internally Compiler convert this into Integer.valueOf(i);
        System.out.println(i);

        Integer x = new Integer(20);
        int x1 = x;  // Internally coplier convert this into x.intValue();
        System.out.println(x1);


    }
}
