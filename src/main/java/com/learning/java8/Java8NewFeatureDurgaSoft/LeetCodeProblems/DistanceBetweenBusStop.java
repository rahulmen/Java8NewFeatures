package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class DistanceBetweenBusStop {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockWise=0;
        int anticlockWise=distance[distance.length-1];
        int temp = start;
        while(temp<destination){
            clockWise=clockWise+distance[temp];
            temp++;
        }

        temp = start;
        while(temp>0){
            anticlockWise+=distance[temp];
            temp--;
        }

        temp = distance.length-1;

        while(temp>destination){
            anticlockWise+=distance[temp-1];
            temp--;
        }


        if(clockWise>=anticlockWise){
            return anticlockWise;
        }else{
            return clockWise;
        }
    }

    public static void main(String[] args) {

        System.out.println(new DistanceBetweenBusStop().distanceBetweenBusStops(new int[]{7,10,1,12,11,14,5,0},7,2));

/*
[7,10,1,12,11,14,5,0]
7
2
 */

    }
}
