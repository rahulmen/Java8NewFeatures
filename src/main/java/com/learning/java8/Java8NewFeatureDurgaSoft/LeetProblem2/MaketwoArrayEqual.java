package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.*;

public class MaketwoArrayEqual {

    public boolean canBeEqual1(int[] target, int[] arr) {
       /* Map<Integer,Integer> map = new HashMap<>();
        for(int i:target){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }*/



    return false;
    }

    public boolean canBeEqual(int[] target, int[] arr) {
      Arrays.sort(target);
      Arrays.sort(arr);
      return Arrays.equals(target,arr);
    }

    public static void main(String[] args) {

        int[] target = {1,2,2,3};
        int[] arr = {1,1,2,3};

        System.out.println(new MaketwoArrayEqual().canBeEqual(target,arr));


    }
}
