package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<>();
        while(left<=right){
            int temp = left;
            boolean isDivisible = true;
            while(temp>0){
                int quotient = temp%10;
                temp=temp/10;
                if(quotient==0 || left%quotient!=0){
                    isDivisible=false;
                    break;
                }
            }
            if(isDivisible==true){
                output.add(left);
            }
            left++;
        }
        return output;
    }

    public static void main(String[] args) {

        System.out.println(new SelfDividingNumber().selfDividingNumbers(1,22));


    }
}
