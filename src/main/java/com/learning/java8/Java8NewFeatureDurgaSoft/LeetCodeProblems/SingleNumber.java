package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;
import java.util.stream.Collectors;

public class SingleNumber {

 /*   public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n:nums){
            if(list.contains(n)){
                list.remove(new Integer(n));
            }else{
                list.add(n);
            }
        }
    return list.get(0);
    }*/

/* public int singleNumber(int[] nums) {

     HashMap<Integer, Integer> map = new HashMap<>();
     for (int num : nums) {
         if (map.containsKey(num)) {
             map.put(num, map.get(num) + 1);
         } else {
             map.put(num, 1);
         }
     }

     for(int num:nums){
         if(map.get(num)==1){
             return num;
         }
     }
     return Integer.MIN_VALUE;
 }*/

    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int setSum=0;
        int numSum=0;

        for(int num:nums){
            if(!set.contains(num)){
                setSum+=num;
                set.add(num);
            }
            numSum+=num;
        }

        return (2*setSum)-numSum;
    }


    public static void main(String[] args) {

        System.out.println(new SingleNumber().singleNumber(new int[]{4,1,2,1,2}));

    }
}
