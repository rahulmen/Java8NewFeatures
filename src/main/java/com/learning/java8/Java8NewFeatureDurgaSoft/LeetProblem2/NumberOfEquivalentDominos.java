package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfEquivalentDominos {

    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int[] i : dominoes) {
            int max;
            int min;
            if (i[0] > i[1]) {
                max = i[0];
                min = i[1];
            } else {
                max = i[1];
                min = i[0];
            }
            int num = (min * 10) + max;
            result += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfEquivalentDominos().numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4},{1,2},{5, 6}}));
    }
}
