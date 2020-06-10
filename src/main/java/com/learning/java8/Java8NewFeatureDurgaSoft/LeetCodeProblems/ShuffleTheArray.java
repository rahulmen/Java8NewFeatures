package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] temp = new int[nums.length];

        int counter =0;
        int iCounter =0;
        int jCounter = n;
        while(counter<nums.length){

            if(counter%2==0){
                temp[counter]= nums[iCounter];
                iCounter++;
            }else{
                temp[counter]= nums[jCounter];
                jCounter++;
            }

            counter++;

        }

        return temp;
    }


    public static void main(String[] args) {

        int[] arr = new ShuffleTheArray().shuffle(new int[]{2,5,1,3,4,7},3);

        System.out.println(Arrays.toString(arr));

    }

}
