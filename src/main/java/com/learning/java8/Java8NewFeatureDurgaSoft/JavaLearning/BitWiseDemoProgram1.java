package com.learning.java8.Java8NewFeatureDurgaSoft.JavaLearning;

public class BitWiseDemoProgram1 {

    public static void main(String[] args) {

        System.out.println(true&false); //false
        System.out.println(true|false); //true
        System.out.println(true^false); //true
        System.out.println(4&5); //4
        /*
        100
        101
        ===
        100  (4)
         */
        System.out.println(4|5); //5
         /*
        100
        101
        ===
        101  (5)
         */
        System.out.println(4^5); //1
         /*
        100
        101
        ===
        001  (1)
         */

    }
}
