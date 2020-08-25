package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.*;

public class ArrayDuplicateIndex {

        private List<Integer> getArrayDuplicate(int[] arr){
            List<Integer> temp= new ArrayList<>();
            Map<Integer,Integer> m1 = new HashMap<>();
            Map<Integer,Integer> m2 = new HashMap<>();

            for(int i=0;i<arr.length;i++){
            if(m1.containsKey(arr[i])){
                m2.put(arr[i],i);
            }else {
                m1.put(arr[i], i);
            }
            }

            for(Map.Entry<Integer,Integer> e : m2.entrySet()){
                temp.add(e.getKey());
                temp.add(m1.get(e.getKey()));
                temp.add(e.getValue());
            }

            return temp;
        }


    public static void main(String[] args) {

        System.out.println(new ArrayDuplicateIndex().getArrayDuplicate(new int[]{2,3,4,5,12,3,4,5,5}));

    }
}
