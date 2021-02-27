package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import com.sun.xml.fastinfoset.util.CharArray;

import java.util.Arrays;

public class IsPrime {


    public int countPrimes1(int n){

        int count =0;

        boolean[] array = new boolean[n];
        Arrays.fill(array,true);
        System.out.println(Arrays.toString(array));


        for(int i=2;i<n;i++){
            if(!array[i]){
                continue;
            }
            count++;
            for(int j=2;i*j<n;j++) {
                array[j * i] = false;
            }
        }

        return count;

    }












    public int countPrimes(int n) {
        //mark array
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);//initialize: true
        int cnt=0;
        for(int i=2; i<n; i++){
            if(!isPrime[i]) {
                continue;
            }
            cnt++;
            if(isPrime[i]){//delete multiples
                for(int j = 2; i*j<n; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        String s = "cbecbehcbew";

        char[] ch = {'c','b','w'};

        for(char c:ch){
            System.out.println(s.contains(c+""));
        }


        //System.out.println(new IsPrime().countPrimes1(10));


    }

}
