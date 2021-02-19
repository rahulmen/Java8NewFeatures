package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxNumberBallsInBox {

    public static int findSum(int num){
        if(num<10){
            return num;
        }else {
            return num % 10 + findSum(num/10);
        }
    }

    public int countBalls(int lowLimit, int highLimit) {

        Map<Integer,Integer> map = new TreeMap<>();

        while(lowLimit<=highLimit){
            int sum = findSum(lowLimit);
            map.put(sum,map.getOrDefault(sum,0)+1);
            lowLimit++;
        }

        System.out.println(map);

        int maxCount = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>maxCount){
                maxCount=m.getValue();
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(new MaxNumberBallsInBox().countBalls(19,28));
    }
}
