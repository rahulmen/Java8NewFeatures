package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class RemoveElement {

        public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }


    public static void main(String[] args) {
        int[] arr = {3,3};
        System.out.println(new RemoveElement().removeElement(arr,3));
        System.out.println(Arrays.toString(arr));
    }
}
