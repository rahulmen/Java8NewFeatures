package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPrimes {

    public int countPrimes(int n) {
        //mark array
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);//initialize: true
        int cnt=0;
        for(int i=2; i<n; i++){
            if(!isPrime[i]) continue;
            cnt++;
            if(isPrime[i]){//delete multiples
                for(int j = 2; i*j<n; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        return cnt;
    }




    // Driver Program
    public static void main(String[] args){
        System.out.println(new CountPrimes().countPrimes(10));
    }
}
