package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayRankTransfer {

    public int[] arrayRankTransform(int[] arr) {

        int[] temp = Arrays.copyOf(arr,arr.length);

        Arrays.sort(temp);

        Map<Integer,Integer> map = new HashMap<>();

        for(int i:temp){
            if(!map.containsKey(i)){
                map.put(i,map.size()+1);
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new ArrayRankTransfer().arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
}
