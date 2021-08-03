package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

public class MaximumPopulation {

    public int maximumPopulation(int[][] logs) {

        int maxPopulation = Integer.MIN_VALUE;
        int maxAgeYear = logs[0][0];
        int maxYear = Integer.MIN_VALUE;

        for(int[] arr:logs){
            int age = 1;
            for(int[] arr1:logs){
                if(arr[0]==arr1[0] && arr[1]==arr1[1]){
                    continue;
                }else if(arr1[0]>arr[1]){
                    continue;
                }else if((arr1[0]<=arr[1]-1 && arr1[0]>=arr[0])||
                        (arr1[0]<arr[0] && arr1[1]>=arr[0])){
                    age++;
                    if(arr1[0]>arr[0])
                        maxAgeYear=arr1[0];
                    else
                        maxAgeYear=arr[0];
                }
            }

            System.out.println("=====");
            System.out.println(age);
            System.out.println(maxPopulation);
            System.out.println(maxYear);
            System.out.println("=====");

            if(age>maxYear){
                maxPopulation=maxAgeYear;
                maxYear=age;
            }
        }
        return maxPopulation;

    }


    public static void main(String[] args) {

        System.out.println
                (new MaximumPopulation().maximumPopulation(new int[][]{{2025,2041},{1988,2007},{2003,2046},{2045,2049},{2025,2027},{2014,2040},{2014,2027},{2011,2027},{1972,2019}}));


    }


}
