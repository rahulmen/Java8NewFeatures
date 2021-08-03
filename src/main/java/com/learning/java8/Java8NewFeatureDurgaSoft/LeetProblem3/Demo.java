package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.*;

public class Demo {

    public static void m1(String s1){
        System.out.println("ebfeb");
    }


    public static void m1(Object s1){
        System.out.println("ebfeb");
    }


    public boolean canThreePartsEqualSum(int[] A) {


        int partition = (A.length/3)+1;

        int j = partition;
        int k = (partition*2);
        Integer pivot = 1;

        System.out.println(j);
        System.out.println(k);

        int firstHalfSum =0;
        int secondHalfSum =0;
        int thirdHalfSum = 0;


        do{
            for(int i=0;i<A.length;i++){
                if(i<j){
                    firstHalfSum+=A[i];
                }else if(i>j && i<k){
                    secondHalfSum+=A[i];
                }else{
                    thirdHalfSum+=A[i];
                }
            }
            System.out.println(firstHalfSum);
            System.out.println(secondHalfSum);
            System.out.println(thirdHalfSum);

            if(firstHalfSum==secondHalfSum && secondHalfSum == thirdHalfSum){
                return true;
            }
        }while(false);


        return false;

    }


    public static void main(String[] args) {
//       m1("ABC");
//       m1(null);
//
//       List<String> list = new ArrayList<>();
//
//       list.add("Push");
//        list.add("Push");
//        list.add("Push");
//        list.add("Push");
//
//        String[] strings = list.toArray(new String[0]);
//
//        System.out.println(Arrays.toString(strings));

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,2);
        map.put(1,1);
        map.put(2,4);
        map.put(3,5);
        map.put(4,3);

        if(map.containsValue(2)){

        }







    }


}
