package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSotArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer,Integer> map = new TreeMap<>();

        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int localCounter =0;
        int counter =0;

        for(int i=0;i<arr1.length;i++){
            int num = map.get(arr2[localCounter]);
            if(num>0){
                arr1[i]=arr2[localCounter];
                map.put(arr2[localCounter],--num);
                counter++;
            }else{
                map.remove(arr2[localCounter]);
                localCounter++;
                i--;
            }
            if(localCounter>=arr2.length){
                break;
            }
        }

        for(Map.Entry<Integer,Integer> m:map.entrySet()){

            int key = m.getKey();
            int value = m.getValue();

            while(counter<arr1.length && value>0){
                arr1[counter]=key;
                value--;
                counter++;
            }

        }


        return arr1;

    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(new RelativeSotArray().relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6})));
    }
}
