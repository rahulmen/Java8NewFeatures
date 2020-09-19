package com.learning.java8.Java8NewFeatureDurgaSoft.DunzoInterview;

import java.util.*;

public class Questiontwo {

    static int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

    //spiral order

    /*
    00(1) 01(2) 02(3)
    10(4) 11(5) 12(6)
    20(7) 21(8) 22(9)

    1 2 3 6 9 8 7 4 5
     */

 /*   public int[] printSpiral(int[][] arr){

        List<Integer> list = new ArrayList<>();
        int j=arr.length-1;
        int i=0;
        int k=0;


        while(i<j && j<i){

            for(k=i;k<i;k++){
                System.out.println(arr[i][k]);
            }
            i++;

            for(k=j;k<j)
        }*/

    public Map<Character,Integer> getFrequency(char[] ch) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:ch){
            if((int)c>=97 && (int)c<=123)
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }


    public static void main(String[] args) {

        System.out.println(new Questiontwo().getFrequency("my name is rahulMendiratta@2103".toCharArray()));

    }




}
