package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map);
        Map.Entry<Integer,Integer> m = null;
        int max =0;

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                m=entry;
            }
        }
        return m.getKey();
    }



    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{3,2,3,2,2,2,2,2,2,2,3,3,3,3,3,3,3}));
    }
}
