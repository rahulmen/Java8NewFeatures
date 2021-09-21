package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DoublePairs {

        public boolean canReorderDoubled(int[] arr) {

            int count = 0;

            l1:
            for (int i = 0; i < arr.length - 1; i++) {
                l2:
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == Integer.MIN_VALUE ) {
                        continue l1;
                    }
                    if ((arr[i] / 2 == arr[j] && arr[i]%2==0) || (arr[j] / 2 == arr[i] && arr[j]%2==0)) {
                        count += 2;
                        arr[i] = Integer.MIN_VALUE;
                        arr[j] = Integer.MIN_VALUE;
                        continue l1;
                    }
                }
            }

            System.out.println(count);
            System.out.println(arr.length);

            if (count >= arr.length) {
                return true;
            }

            return false;
        }

    public static void main(String[] args) {
        System.out.println(new DoublePairs().canReorderDoubled(new int[]{4,-2,2,-4}));
        }

}
