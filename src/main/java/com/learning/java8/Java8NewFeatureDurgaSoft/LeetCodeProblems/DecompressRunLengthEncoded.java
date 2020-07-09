package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class DecompressRunLengthEncoded {

    List<Integer> list = new LinkedList<>();
    BiConsumer<Integer,Integer> listIntegerListBiFunction = (i1, i2)->{
        for(int i=0;i<i1;i++){
            list.add(i2);
        }
    };

    public int[] decompressRLElist(int[] nums) {
        for(int i=0;i<nums.length;i+=2){
          listIntegerListBiFunction.accept(nums[i],nums[i+1]);
        }
        int[] temp = new int[list.size()];
        for(int i=0;i<temp.length;i++){
            temp[i]=list.get(i);
        }
        return temp;
    }

    public int[] decompressRLElist1(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<nums.length;i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i+1]);
            }
        }
        int[] temp = new int[list.size()];
        for(int i=0;i<temp.length;i++){
            temp[i]=list.get(i);
        }
        return temp;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new DecompressRunLengthEncoded().decompressRLElist(new int[]{1,2,3,4})));

    }
}
