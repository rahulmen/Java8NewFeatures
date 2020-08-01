package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;

public class SortIntegerByNumberOfOneBits {

    public int[] sortByBits(int[] arr) {
        int[] temp = new int[arr.length];

        Map<Integer, List<Integer>> map = new TreeMap<>();

        for (int i = 0; i < temp.length; i++) {
            if (arr[i] == 0) {
                if (map.containsKey(0)) {
                    map.get(0).add(arr[i]);
                } else {
                    map.put(0, new ArrayList<>(Arrays.asList(arr[i])));
                }
                //map.getOrDefault(0,new ArrayList<>(Arrays.asList(arr[i]))).add(arr[i]);
                //map.put(arr[i], 0);
            } else if (arr[i] == 1 || arr[i] == 2) {
                if (map.containsKey(1)) {
                    map.get(1).add(arr[i]);
                } else {
                    map.put(1, new ArrayList<>(Arrays.asList(arr[i])));
                }
            } else if (arr[i] % 2 == 0 && (arr[i] / 2) % 2 == 0) {
                if (map.containsKey(1)) {
                    map.get(1).add(arr[i]);
                } else {
                    map.put(1, new ArrayList<>(Arrays.asList(arr[i])));
                }
            } else if (arr[i] % 2 == 1 && (arr[i] / 2) % 2 == 0) {
                if (map.containsKey(2)) {
                    map.get(2).add(arr[i]);
                } else {
                    map.put(2, new ArrayList<>(Arrays.asList(arr[i])));
                }
            } else if (arr[i] % 2 == 1 && (arr[i] / 2) % 2 == 1) {
                if ((arr[i] / 2) < 3) {
                    if (map.containsKey(2)) {
                        map.get(2).add(arr[i]);
                    } else {
                        map.put(2, new ArrayList<>(Arrays.asList(arr[i])));
                    }
                } else {
                    if (map.containsKey(3)) {
                        map.get(3).add(arr[i]);
                    } else {
                        map.put(3, new ArrayList<>(Arrays.asList(arr[i])));
                    }
                }
            } else if (arr[i] % 2 == 0 && (arr[i] / 2) % 2 == 1) {
                if ((arr[i] / 2) < 3) {
                    if (map.containsKey(2)) {
                        map.get(2).add(arr[i]);
                    } else {
                        map.put(2, new ArrayList<>(Arrays.asList(arr[i])));
                    }
                } else {
                    if (map.containsKey(3)) {
                        map.get(3).add(arr[i]);
                    } else {
                        map.put(3, new ArrayList<>(Arrays.asList(arr[i])));
                    }
                }
            }
        }
            System.out.println(map);

            int counter = 0;
            for (Map.Entry<Integer, List<Integer>> m : map.entrySet()) {
                List<Integer> l = m.getValue();
                l.sort((i1,i2)->i1.compareTo(i2));
                for (int i1 : l) {
                    temp[counter] = i1;
                    counter++;
                }
            }
            return temp;
        }




    public static void main(String[] args) {

        System.out.println(Arrays.toString(new SortIntegerByNumberOfOneBits().sortByBits(new int[]{0,1,2,3,4,5,6,7,8})));


    }
}
