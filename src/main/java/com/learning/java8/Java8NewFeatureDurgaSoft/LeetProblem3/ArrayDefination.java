package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Map;
import java.util.TreeMap;

public class ArrayDefination {

    static int[] arr = {1,2,3,4,5};

    static Map<Integer,String> map = new TreeMap<Integer,String>(){
        @Override
        public int size(){
         return Integer.MIN_VALUE;
        }
    };

    static Map<Integer,String> map1 = new TreeMap<Integer,String>(){
        @Override
        public int size(){
            return Integer.MIN_VALUE;
        }
    };

    public static void main(String[] args) {

        ArrayDefination arrayDefination = new ArrayDefination();

        for(int i=0;i<arr.length;i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Size is : "+map.size());

        System.out.println(map.getClass().getName());
        System.out.println(map1.getClass().getName());
        System.out.println(arrayDefination.getClass().getName());
        System.out.println(arrayDefination.getClass().getSimpleName());

    }

}
