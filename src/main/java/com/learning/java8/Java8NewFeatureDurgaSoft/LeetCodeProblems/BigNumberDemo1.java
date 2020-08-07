package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.math.BigDecimal;

public class BigNumberDemo1 {

    public String addStrings(String num1, String num2) {
        int i=0;
        int j=0;

        String num="";
        int carry =0;
        while(i<num1.length() || j<num2.length()){
            String c1="0",c2="0";
            try {
                c1 = num1.substring(num1.length() - i - 1, num1.length() - i);
            }catch(Exception nsee){
            }
            try {
                c2 = num2.substring(num2.length() - i - 1, num2.length() - i);
            }catch(Exception nsee){
            }

            int temp = Integer.valueOf(c1)+Integer.valueOf(c2)+carry;
            carry = temp/10;
            int firstInt = temp%10;
            num = firstInt+num;
            i++;j++;
        }
        if(carry!=0){
            num=carry+num;
        }
        return num;
    }

    public static void main(String[] args) {

        System.out.println(new BigNumberDemo1().addStrings("999","1"));

    }
}
